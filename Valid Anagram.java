/**
// Given two strings s and t, write a function to determine if t is an anagram of s.

// For example,
// s = "anagram", t = "nagaram", return true.
// s = "rat", t = "car", return false.

// Note:
// You may assume the string contains only lowercase alphabets.
遍历s中的每一个字符，如果在t中存在，就删除t中的。最后t如果变成空，就true；否则false
*/
public class Solution{
	public boolean isAnagram(String s,String t){
		if(s==null&&t==null)
			return true;
		else if(s==null||t==null)
			return false;
		StringBuilder sb=new StringBuilder();
		sb.append(t);
		int lens=s.length();
		for(int i=0;i<s.length();i++){
			// char c=s.charAt(i);
			String tmp=String.valueOf(s.charAt(i));
			int location=sb.indexOf(tmp);
			if(location==-1)
				return false;
			sb.deleteCharAt(location);
		}
		if(sb.length()==0)
			return true;
		else 
			return false;
	}
}