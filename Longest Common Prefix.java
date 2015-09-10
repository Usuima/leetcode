public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null)
            return "";
        int i=1;
        String pre=strs[0];
        while(i<strs.length){
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;
    }
}