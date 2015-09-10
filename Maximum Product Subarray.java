
/**	
* 利用max[i]保存以i结尾的最大值，
* 利用min[i]保存以i结尾的最小值，
* maxPro是a[i],min[i-1]*a[i],max[i-1]*a[i]的最大值
*/
public class Solution {
    public int maxProduct(int[] nums) {
        int[] max=new int[nums.length];
        int[] min=new int[nums.length];
        int maxPro=nums[0];
        max[0]=nums[0];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        	max[i]=MaxOfThree(nums[i],max[i-1]*nums[i],min[i-1]*nums[i]);
        	min[i]=MinOfThree(nums[i],max[i-1]*nums[i],min[i-1]*nums[i]);
        	if(max[i]>maxPro)
        		maxPro=max[i];
        }
        return maxPro;
    }
    private int MaxOfThree(int a,int b,int c){
    	int max=(a>=b?a:b);
    	max=(max>=c?max:c);
    	return max;
    }
    private int MinOfThree(int a,int b,int c){
    	int min=(a<=b?a:b);
    	min=(min<=c?min:c);
    	return min;
    }
}