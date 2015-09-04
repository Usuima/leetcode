/**
 * i指向最后边的0的位置，k指向最左边的2的位置，j用来依次判断每个元素
 */
public class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0||nums==null)
            return;
        int j=0,i=-1,k=nums.length;
        for(j=0;j<k;j++){
            if(nums[j]==0&&i!=j){
                i++;
                swap(nums,i,j);
                j--;
            }
            else if(nums[j]==2&&j!=k){
                k--;
                swap(nums,j,k);
                j--;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}