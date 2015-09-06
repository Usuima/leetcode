/**
*采用递归树的思想，当左括号数大于右括号数时可以加左或者右括号，否则只能加左括号，当左括号数达到n时，
*剩下全部加右括号。
*
*/
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<String>();
        if(n==0)
        	return ans;
       	generate(ans,"",0,0,n);
        return ans;
    }
    private void generate(ArrayList<String> res,String tmp,int l,int r,int n){
    	if(l==n){
    		for(int i=0;i<n-r;i++){
    			tmp+=")";
    		}
    		res.add(tmp);
    		return;
    	}
    	generate(res,tmp+"(",l+1,r,n);
    	if(l>r)
    		generate(res,tmp+")",l,r+1,n);
    }
}