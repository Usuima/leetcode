/**
*Given an array of integers, 
*return indices of the two numbers such that they add up to a specific target.
*
*You may assume that each input would have exactly one solution, 
*and you may not use the same element twice.
*
*Example:
*Given nums = [2, 7, 11, 15], target = 9,
*
*Because nums[0] + nums[1] = 2 + 7 = 9,
*return [0, 1].
**/
/**
*map<k,v>
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){//已经存在可以配对的
                result[1]=i+1;//获取id2
                result[0]=hm.get(target-nums[i]);//获取id1
                return result;
            }
            hm.put(nums[i],i+1);//没有可以配对的，添加到hash表
        }
        return result;
    }
}