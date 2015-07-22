/*******
题目比较不直观，这里的描述比较好一些  http://www.careercup.com/question?id=4425679
"Count and Say problem" Write a code to do following: 
n String to print 
0 1 
1 1 1    因为前面一行有1个1
2 2 1     因为前面一行有2个1
3 1 2 1 1  因为前面一行有1个2和1个1
... 
Base case: n = 0 print "1" 
for n = 1, look at previous string and write number of times a digit is seen and the digit itself. In this case, digit 1 is seen 1 time in a row... so print "1 1" 
for n = 2, digit 1 is seen two times in a row, so print "2 1" 
for n = 3, digit 2 is seen 1 time and then digit 1 is seen 1 so print "1 2 1 1" 
for n = 4 you will print "1 1 1 2 2 1" 

Consider the numbers as integers for simplicity. e.g. if previous string is "10 1" then the next will be "1 10 1 1" and the next one will be "1 1 1 10 2 1"
**************/

public class Solution {
    public String countAndSay(int n) {
        String s = "1";  
        for(int i=1; i<n; i++) {  
            int cnt = 1;  
            StringBuilder tmp = new StringBuilder();  
            for(int j=1; j<s.length(); j++) {  
                if(s.charAt(j) == s.charAt(j-1)) {  
                    cnt++;  
                } else {  
                    tmp.append(cnt).append(s.charAt(j-1));  
                    cnt = 1;  
                }  
            }  
            tmp.append(cnt).append(s.charAt(s.length()-1));  
            s = tmp.toString();  
        }  
          
        return s;  
    }
}
