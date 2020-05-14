class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        if(high == 1){
            return nums[low];
        }
        
        while(low<high){
            int mid = (low+high)/2;
        
            if(((mid%2) == 0 && nums[mid] == nums[mid+1]) || ((mid%2) == 1 && nums[mid] == nums[mid-1])){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return nums[high];
    }
}
