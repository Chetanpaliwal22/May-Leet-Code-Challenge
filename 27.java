class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>(N + 1);
        for(int i = 0; i <= N; i++) graph.add(new ArrayList<Integer>());
        for(int[] d : dislikes){
            graph.get(d[0]).add(d[1]);
            graph.get(d[1]).add(d[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[N + 1];
        Arrays.fill(visited, -1);
        for(int i = 1; i < N + 1; i++){
            if(visited[i] == -1){
                visited[i] = 0;
                queue.offer(i);
                while(!queue.isEmpty()){
                    int u = queue.poll();
                    for(int v : graph.get(u)){
                        if(visited[v] == -1){
                            visited[v] = (visited[u] == 0 ? 1 : 0);
                            queue.offer(v);
                        }
                        else if(visited[v] == visited[u]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
