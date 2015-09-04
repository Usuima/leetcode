/**
 * 两个指针，i指向字串的末尾，遍历并且判断是否字符已经重复。j指向字串的头。
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int max=0;
        for(int i=0,j=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                j=Math.max(j,hm.get(s.charAt(i))+1);
            }
            hm.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}