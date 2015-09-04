/**
	选择排序
	将第i小的元素放到nums[i]之中，
*/
public class Selection(){
	public void sort(int[] nums){
		int len=nums.length;
		for(int i=0;i<len;i++){
			int min=i;
			for(int j=i+1;j<len;j++){
				if(nums[min]>nums[j]){
					min=j;
				}
			}
			int t=nums[min];
			nums[min]=nums[i];
			nums[i]=t;
		}
	}
}