/**
*使用哈希表HashMap<Key,Value>
*/
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(!hs.containsKey(nums[i])){
        		hs.put(nums[i],i);
        	}
        	else{
        		if(Math.abs(hs.get(nums[i])-i)<=k)
        			return true;
        		else {
        			hs.remove(nums[i]);
        			hs.put(nums[i],i);
        		}
        	}
        }
        return false;
    }
}

/**
*正常一点
*/
public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int i = 0; i <  nums.length; i++) {
        Integer ord = map.put(nums[i], i);
        if(ord != null && i - ord <= k) {
            return true;
        }
    }

    return false;
}