class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<len;i++){
            if(hm.containsKey(nums[i])){
              hm.remove(nums[i]);
            }    
            else{
              hm.put(nums[i],1);
            }
        }
        
        for(Integer key: hm.keySet()){
          return key;
        }
        return -1;
    }
}
