public class Solution {
    public void nextPermutation(int[] nums) {
        //找到排序中最后（最右）一个升序的首位位置i,x=a[i]
        int len=nums.length;
        if(len<=1)
            return;
        int i;
        for(i=len-2;(i>=0)&&nums[i]>=nums[i+1];i--){
            ;
        }
        if(i<0){
            //已经是最后一个序列，返回lowest
            reverse(nums,0);
            return;
        }
        int k;
        //找到排列中第i为右边最后一个比a[i]大的位置，y=a[k]
        for(k=len-1;(k>i)&&(nums[k]<=nums[i]);k--){
            ;
        }
        //交换x，y
        swap(nums,i,k);
        //把第(i+1)位到最后的部分翻转
        reverse(nums,i+1);
    }
    private void swap(int[] nums,int i,int k){
        int t=nums[i];
        nums[i]=nums[k];
        nums[k]=t;
    }
    private void reverse(int nums[],int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}