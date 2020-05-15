class Solution {
    public int maxSubarraySumCircular(int[] A) {
        
        if(A.length == 0) return 0;
        
        int maxSum = A[0];
        
        int maxCont = A[0];
        int maxTotal = A[0];
        int minTotal = A[0];
        int minCont = A[0];
        
        for(int i = 1; i < A.length; i++){
            int num = A[i];
            maxCont = Math.max(num, maxCont + num);
            maxTotal = Math.max(maxCont, maxTotal);
            
            minCont = Math.min(num, minCont + num);
            minTotal = Math.min(minTotal, minCont);
            
            maxSum += num;
        }
        if(maxSum == minCont) return maxTotal;
        return Math.max(maxSum - minTotal, maxTotal);
        
    }
}
