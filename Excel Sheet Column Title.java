public class Solution {
    public String convertToTitle(int n) {
        if(n<=0)
            return null;
        StringBuilder s=new StringBuilder();
        while(n>0){
            n--;//attention!!!!!!!!!!!!!!!!!!!!!!!!!
            s.insert(0,(char)(n%26+'A'));
            n/=26;
        }
        return s.toString();
    }
}
