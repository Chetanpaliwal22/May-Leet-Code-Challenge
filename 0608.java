class Solution {
    public boolean isPowerOfTwo(int n) {
        long val=1;
        while(val<n){
            val*=2;
        }
        return val==n;
    }
}
