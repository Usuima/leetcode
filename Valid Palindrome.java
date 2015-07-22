public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()||s.length()==1)
            return true;
        int len=s.length();
        for(int i=0,j=len-1;i<=j;i++,j--)
        {
            while(!Character.isLetterOrDigit(s.charAt(i))&&i!=j)
            {
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j))&&i!=j)
            {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
}
