/**
// Given two strings s and t, write a function to determine if t is an anagram of s.

// For example,
// s = "anagram", t = "nagaram", return true.
// s = "rat", t = "car", return false.

// Note:
// You may assume the string contains only lowercase alphabets.
使用int数组来表示每一个字幕出现的次数
*/
public class Solution{
	public boolean isAnagram(String s,String t){
		if(s==null&&t==null)
			return true;
		else if(s==null||t==null)
			return false;
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)-'a']++;
		}
		for(int j=0;j<t.length();j++){
			arr[t.charAt(j)-'a']--;
			if(arr[t.charAt(j)-'a']<0)
				return false;
		}
		for(int i:arr){
			if (i!=0) {
				return false;
			}
		}
		return true;
	}
}