public class Solution {
    public String longestPalindrome(String s) {
        int i,j,max,c,start,t=0;
        if(s==null||s.length()<1)
            return null;
        int n=s.length();
        max=0;
        start=0;c=0;
        for(i=0;i<n;i++){
            for(j=0;(i-j>=0)&&(i+j<n);j++){
                if(s.charAt(i-j)!=s.charAt(i+j))
                    break;
                c=1+j*2;
                t=i-j;
            }
            if(c>max){
                max=c;
                start=t;
            }
                
            for(j=0;(i-j>=0)&&(i+j+1<n);j++){
                if(s.charAt(i-j)!=s.charAt(i+j+1)){
                    break;
                }
                c=2+j*2;
                t=i-j;
            }
            if(c>max){
                start=t;
                max=c;
            }
               
        }
        return s.substring(start,start+max);
    }
}