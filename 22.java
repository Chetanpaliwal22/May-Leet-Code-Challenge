class Solution {
    public String frequencySort(String s) {
        
        if(s == null || s.length() == 0){
            return "";
        } 
        
        Map<Character, Integer> map = new HashMap<>();
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
          (a, b) -> b.getValue() - a.getValue()
        );
        
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.offer(entry);
        }
        
        char[] arr = new char[s.length()];
        int count = 0;
        
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            for(int i = 0; i < entry.getValue(); i++){
                arr[count++] = ch;
            }
        }
        
        return new String(arr);   
    }
}
