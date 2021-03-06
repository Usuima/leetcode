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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new List<String>();
        if(root!=null)
        	searchBTP(root,"",ans);
        return ans;
    }

    private void searchBTP(TreeNode root,String path,List<String> ans){
    	if(root.left==null&&root.right==null)
    		ans.add(path+root.val);
    	if(root.left!=null)
    		searchBTP(root.left,path+root.val+"->",ans);
    	if(root.right!=null)
    		searchBTP(root.right,path+root.val+"->",ans);
    }
}