/**
改自3sum
*/
public class Solution{
	public int threeSumClosest(int[] nums,int target){
		Arrays.sort(nums);
		int min=Integer.MAX_VALUE;//target和实际和之间的差
		int actsum=0;//实际的三个数的和
		for(int i=0;i<nums.length-2;i++){
			if(i==0||(i>0&&nums[i]!=nums[i-1])){
				int lo=i+1,hi=nums.length-1,sum=target-nums[i];
				while(lo<hi){
					if(nums[lo]+nums[hi]==sum){
						return target;
					}
					else if(nums[lo]+nums[hi]<sum){
						if(Math.abs(sum-nums[lo]-nums[hi])<min){
							min=Math.abs(sum-nums[lo]-nums[hi]);
							actsum=nums[lo]+nums[hi]+nums[i];
						}						
						lo++;
					}
					else {
						if(Math.abs(sum-nums[lo]-nums[hi])<min){
							min=Math.abs(sum-nums[lo]-nums[hi]);
							actsum=nums[lo]+nums[hi]+nums[i];
						}
						hi--;
					}
				}
			}
		}
		return actsum;
	}
}