/*Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
*/
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
	TreeNode parentX, parentY, prev;
	int depthX = -1, depthY = -1;

	public boolean isCousins(TreeNode root, int x, int y) {
		if (root == null) {
			return false;
		}
		checkCousins(root, x, y, -1);
		return parentX != parentY && depthX == depthY;
	}

	public void checkCousins(TreeNode node, int x, int y, int depth) {
		if (node == null) {
			return;
		}

		if (node.val == x) {
			parentX = prev;
			depthX = depth;
			return;
		} else if (node.val == y) {
			parentY = prev;
			depthY = depth;
			return;
		}

		prev = node;
		checkCousins(node.left, x, y, depth + 1);
		checkCousins(node.right, x, y, depth + 1);

	}
}
