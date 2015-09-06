/**
 * 递归方法，依次把每个字母添加到已经排好的字符串前面。
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<String>();
        if(digits==null||digits.length()==0)
        	return ans;
        ans.add("");
        String digitletter[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
        	ans=combine(ans,digitletter[digits.charAt(i)-'0']);
        }
        return ans;
    }

    private List<String> combine(List<String> l,String d){
    	List<String> ans=new ArrayList<String>();
    	for(int i=0;i<d.length();i++){
    		for(String x:l){
    			ans.add(x+d.charAt(i));
    		}
    	}
    	return ans;
    }
}