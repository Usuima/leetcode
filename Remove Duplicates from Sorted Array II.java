/**
j左指针，i右指针，最后长度即为j的值
添加一个计数器
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(n==0){
        	return 0;
        }
        int j=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
        	if(nums[j]==nums[i]){
        		count++;
        		if(count<2){
        			j++;
	        		nums[j]=nums[i];        			
        		}
        	}
        	if(nums[j]!=nums[i]){
        		count=0;
        		j++;
        		nums[j]=nums[i];
        	}
        }
        return j+1;
    }
}