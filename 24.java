/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null || preorder.length ==0 ){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        
        for(int i=1;i<preorder.length;i++){
            
            TreeNode temp = null;
            
            while(!s.isEmpty() && preorder[i] > s.peek().val) { 
                temp = s.pop(); 
            }     
            
            if(temp!=null){
                temp.right = new TreeNode(preorder[i]);
                s.push(temp.right);
            }else{
                temp = s.peek();
                temp.left = new TreeNode(preorder[i]);
                s.push(temp.left);
            }
            
        }
        return root;            
    }
}
