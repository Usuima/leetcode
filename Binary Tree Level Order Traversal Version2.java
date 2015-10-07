/**
 * 使用队列实现
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
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	List<List<Integer>> list=new LinkedList<List<Integer>>();
    	if(root==null) 
    		return list;
    	queue.offer(root);
    	while(!queue.ifEmpty()){
    		int levelNum=queue.size();
    		List<Integer> item=new ListedList<Integer>();
    		for(int i=0;i<levelNum;i++){
    			if(queue.peek().left!=null)
    				queue.offer(queue.peek().left);
    			if(queue.peek().right!=null)
    				queue.offer(queue.peek().right);
    			item.add(queue.poll().val);
    		}
    		list.add(item);
    	}
    	return list;
    }
}