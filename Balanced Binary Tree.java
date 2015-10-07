/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(height(root.left)-height(root.right))<2&&isBalanced(root.left)&&isBalanced(root.right))
            return true;
        else
            return false;
    }
    private int height(TreeNode root){
        if(root==null)
            return 0;
        int right=height(root.right)+1;
        int left=height(root.left)+1;
        int max=left>right?left:right;
        return max;
    }
}