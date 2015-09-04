public class Solution {
    public int addDigits(int n) {
        if(n<=0)
	        return n;
		int next=0;
		while(n>=10){
			while(n>0){
				next+=n%10;
				n=n/10;
			}
			n=next;
			next=0;
			if(n<10)
				return n;
		}
		return n;
    }
}