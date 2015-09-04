/**
 插入排序
*/
public class Insertion(){
	public void sort(int[] nums){
		int len=nums.length;
		for(int i=0;i<len;i++){
			for(int j=i;j>0&&nums[j]<nums[j-1];j--){
				swap(nums,j,j-1);
			}
		}
	}
	private void swap(int[] nums,int i,int j){
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
}