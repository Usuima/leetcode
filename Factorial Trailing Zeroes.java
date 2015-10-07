/**
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/


/*挨个算里面有多少个5 Time limit exceeded*/
public class Solution {
    public int trailingZeroes(int n) {
    	return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}


/**
or
*/
public class Solution {
    public int trailingZeroes(int n) {
    	int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}