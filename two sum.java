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