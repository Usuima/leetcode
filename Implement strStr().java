//应该用KMP，但是不记得怎么写了
public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        if(haystack.isEmpty()&&!needle.isEmpty())
            return -1;
        int lh=haystack.length();
        int ln=needle.length();
        if(ln>lh)
        	return -1;
        int i=0,j=0;
        int p=0;
        while(i<=lh-ln){
            j=0;
        	while(i<=lh-ln&&haystack.charAt(i)!=needle.charAt(j))//注意这两个条件写的顺序，否则容易造成溢出。
        		i++;
        	if(i>lh-ln)
        		return -1;
        	p=i;//定位
        	for(j=0;j<ln;j++,i++){
        		if(haystack.charAt(i)!=needle.charAt(j)){
        			i=p+1;
        			break;
        		}
        	}
        	if(j==ln)
        		return p;
        }
        return -1;
    }
}
