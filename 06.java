/*Input: [3,2,3]
Output: 3

Input: [2,2,1,1,1,2,2]
Output: 2
*/
class Solution {
	public int majorityElement(int[] nums) {

		int majmark = nums.length / 2;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				int freq = hm.get(nums[i]);
				if (freq >= majmark) {
					return nums[i];
				}
				hm.put(nums[i], freq + 1);
			} else {
				hm.put(nums[i], 1);
			}
		}
		return nums[nums.length - 1];
	}
}
