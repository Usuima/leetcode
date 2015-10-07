/**
 * 未使用队列
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result=new ArrayList<>();
    	List<TreeNode> level=new ArrayList<>();//设置一个保留节点的临时List
    	level.add(root);
    	while(true){
    		if(level.isEmpty()||level.get(0)==null){
    			break;
    		}
    		List<TreeNode> nextLevel=new ArrayList<>();
    		List<Integer> currLevel=new ArrayList<>();
    		for(TreeNode node:level){
    			currLevel.add(node.val);
    			if(node.left!=null){
    				nextLevel.add(node.left);
    			}
    			if(node.right!=null){
    				nextLevel.add(node.right);
    			}
    		}
    		result.add(currLevel);
    		level=nextLevel;
    	}
    	return result;
    }
}