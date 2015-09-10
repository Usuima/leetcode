public class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        for(int i=0;i<len;){
            if(nums[i]==val){
                len--;
                swap(nums,i,len);
            }
            else
                i++;
        }
        return len;
    }
    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}