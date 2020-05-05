/*
 * s = "leetcode" return 0.
 * 
 * s = "loveleetcode", return 2.Math.max(nodeVal, Math.max(nodeVal + left +
 * right, Math.max(nodeVal + left, nodeVal + right))); maxsum = Math.max(maxsum,
 * totalSum);
 * 
 * return Math.max(nodeVal, Math.max(nodeVal + left, nodeVal + right)); } }
 */

class Solution {
	public int firstUniqChar(String s) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			} else {
				hm.put(s.charAt(i), (hm.get(s.charAt(i)) + 1));
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
