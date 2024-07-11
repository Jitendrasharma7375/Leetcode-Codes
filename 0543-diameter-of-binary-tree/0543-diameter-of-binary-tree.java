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
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
       heightOfTree(root);
       return maxi-1;
    }
    public int heightOfTree(TreeNode root){
        if(root==null)return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        int dia=leftHeight+rightHeight+1;

        maxi=Math.max(dia,maxi);
        return Math.max(leftHeight, rightHeight)+1;
    }
}