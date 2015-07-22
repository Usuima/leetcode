public class Solution {
    public String addBinary(String a, String b) {
        if(a.isEmpty())
            return b;
        if(b.isEmpty())
            return a;
        StringBuilder buffer=new StringBuilder();
        int la=a.length();
        int lb=b.length();
        int i=0;
        int carry=0;
        while(i<la||i<lb){
            int t1=(i<la)?Character.getNumericValue(a.charAt(la-1-i)):0;
            int t2=(i<lb)?Character.getNumericValue(b.charAt(lb-1-i)):0;
            buffer.insert(0,(t1+t2+carry)%2);
            if(t1+t2+carry>=2){
                carry=1;
            }
            else{
                carry=0;
            }
            i++;
        }
        if(carry==1)
            buffer.insert(0,1);
        return buffer.toString();
    }
}
