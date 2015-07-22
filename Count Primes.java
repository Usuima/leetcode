public class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        Integer a=new Integer(n);
        if(a>=Integer.MAX_VALUE)
            return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(i==2||i==3)
                count++;
            else if(i%2==0||i%3==0)
                continue;
            else if(isPrime(i))
                count++;
        }
        return count;
    }
    private boolean isPrime(int k){//正常的判断素数的方法
        for(int i=5;i*i<=k;i+=6){
            if(k%i==0||k%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
