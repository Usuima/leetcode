/**
j左指针，i右指针，最后长度即为j的值
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(n==0){
        	return 0;
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
        	if(nums[j]!=nums[i]){
        		j++;
        		nums[j]=nums[i];
        	}
        }
        return j+1;
    }
}