/*https://en.wikipedia.org/wiki/Digital_root*/
public class Solution {

    public int addDigits(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }

}