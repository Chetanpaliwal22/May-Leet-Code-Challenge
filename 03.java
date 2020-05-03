/*canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true*/

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < magazine.length(); i++) {
			if (!hm.containsKey(magazine.charAt(i))) {
				hm.put(magazine.charAt(i), 1);
			} else {
				hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			if (!hm.containsKey(ransomNote.charAt(i)) || hm.get(ransomNote.charAt(i)) < 1) {
				return false;
			} else {
				hm.put(ransomNote.charAt(i), hm.get(ransomNote.charAt(i)) - 1);
			}
		}

		return true;
	}
}
