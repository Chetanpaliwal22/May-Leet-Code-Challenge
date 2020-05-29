class Solution {
    public int[] countBits(int num) {
      if (num < 0)
            return null;
        
        int[] arr = new int[num+1];
        arr[0] = 0;
        
        for (int i = 1; i <= num; i++) {
            arr[i] = arr[i & i-1]+1;
        }
        
        return arr;  
    }
}
