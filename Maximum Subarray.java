/**
 *事实上，当我们令currSum为当前最大子数组的和，maxSum为最后要返回的最大子数组的和，当我们往后扫描时，
 * 对第j+1个元素有两种选择：要么放入前面找到的子数组，要么做为新子数组的第一个元素；
 * 如果currSum加上当前元素a[j]后不小于a[j]，则令currSum加上a[j]，否则currSum重新赋值，置为下一个元素，即currSum = a[j]。
 * 同时，当currSum > maxSum，则更新maxSum = currSum，否则保持原值，不更新。 
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<=0)
        	return 0;
        int currSum=0,maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
        	currSum+=nums[i];
        	if(currSum<nums[i]){
        		currSum=nums[i];
        	}
        	if(currSum>maxSum){
        		maxSum=currSum;
        	}
        }
        return maxSum;
    }
}