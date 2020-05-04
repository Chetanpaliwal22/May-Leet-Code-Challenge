/*
 * Input: 5 Output: 2 Explanation: The binary representation of 5 is 101 (no
 * leading zero bits), and its complement is 010. So you need to output 2.
 */

class Solution {
	public int findComplement(int num) {
		String binStr = Integer.toBinaryString(num);

		StringBuilder resStr = new StringBuilder();

		for (int i = 0; i < binStr.length(); i++) {
			char ch = binStr.charAt(i);
			if (ch == '1') {
				resStr.append("0");
			} else {
				resStr.append("1");
			}
		}

		return Integer.parseInt(resStr.toString(), 2);
	}
}
