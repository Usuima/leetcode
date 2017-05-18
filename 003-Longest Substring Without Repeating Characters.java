/**
*Given a string, find the length of the longest substring without repeating characters.
*
*Examples:
*
*Given "abcabcbb", the answer is "abc", which the length is 3.
*
*Given "bbbbb", the answer is "b", with the length of 1.
*
*Given "pwwkew", the answer is "wke", 
*with the length of 3. Note that the answer must be a substring, 
*"pwke" is a subsequence and not a substring.
*
**/
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