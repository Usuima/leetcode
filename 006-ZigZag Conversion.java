/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
**/
/**
/*n=numRows
Δ=2n-2    1                           2n-1                         4n-3
Δ=        2                     2n-2  2n                    4n-4   4n-2
Δ=        3               2n-3        2n+1              4n-5       .
Δ=        .           .               .               .            .
Δ=        .       n+2                 .           3n               .
Δ=        n-1 n+1                     3n-3    3n-1                 5n-5
Δ=2n-2    n                           3n-2                         5n-4
*/
**/
public class Solution {
    public String convert(String s, int numRows) {
        int len=s.length();
        if(numRows<=1||len<=numRows)
        	return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++)
    	{
        	for(int j=i;j<len;j+=2*(numRows-1))
        	{
            	sb.append(s.charAt(j));
                if(i!=0 && i!=numRows-1)
            	{
                	int t=j+2*(numRows-1)-2*i;
                	if(t<len)
                    	sb.append(s.charAt(t));
            	}
        	}
    	}
    	return sb.toString();
    }
}