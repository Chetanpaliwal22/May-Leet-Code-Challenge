/*
Input: N = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3
*/

class Solution {
    public int findJudge(int N, int[][] trust) {
        
        if(trust.length == 0){
            return 1;
        }
        
        int[] trustArr = new int[N+1];
        HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<trust.length;i++){
            trustArr[trust[i][0]-1] = -1;
            if(trustArr[trust[i][1]-1] != -1){ 
            if(!hm.containsKey(trust[i][1])){
                List<Integer> list = new ArrayList<Integer>();
                list.add(trust[i][0]);
                hm.put(trust[i][1],list);
            }else{
                List<Integer> list = hm.get(trust[i][1]);
                list.add(trust[i][0]);
                hm.put(trust[i][1],list);
            }
            }
        }
        
        for(int i=0;i<N;i++){
            if(trustArr[i] != -1 && hm.get(i+1) !=null && hm.get(i+1).size() == N-1){
                return i+1;
            }
        }
        return -1;    
    }
}
