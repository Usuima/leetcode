/**时间复杂度为O(nlogn)的方法
*没看
*/
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        //定义一个sum数组，其中存放当前位置之前的左右元素之和
        int min=Integer.MAX_VALUE;
        int[] sum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            sum[i+1]=sum[i]+nums[i];
            if(sum[i+1]>=s){
                int j=binarySearch(0,i,sum[i+1]-s+1,sum);
                if(j>-1){
                    min=Math.min(min,i-j+1);
                }
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }


    int binarySearch(int left, int right, int target, int[] sum) {  
        int result = -1;  
        while (left < right-1) {  
            int m = left + (right-left)/2;  
            if (sum[m] >= target) {  
                right = m-1;  
            } else if (sum[m] < target) {  
                left = m;  
            }  
        }  
        if (sum[right] < target) {  
            return right;  
        } else if (sum[left] < target) {  
            return left;  
        } else {  
            return -1;  
        }  
    }  

}