/**
* left[i]保存nums[i]左边所有数字的乘积,
* right[i]保存nums[i]右边所有数字的乘积
*/
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null){
        	return null;
        }
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1,j=nums.length-2;i<nums.length;i++,j--){
        	left[i]=left[i-1]*nums[i-1];
        	right[j]=right[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
        	ans[k]=left[k]*right[k];
        }
        return ans;
    }
}