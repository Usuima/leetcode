/**
*滑动窗口
*/
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0||nums==null)
        	return 0;
        int currSum=0,head=0,tail=0;
        int min=nums.length+1;
        for(tail=0;tail<nums.length;tail++){
        	currSum+=nums[tail];
        	while(currSum>=s){
        		min=Math.min(min,tail-head+1);
        		currSum-=nums[head];
        		head++;
        	}
        }
        return (min==nums.length+1)?0:min;
    }
}