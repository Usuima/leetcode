/**
Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].

*/

//the basic idea is, to permute n numbers, 
//we can add the nth number into the resulting List<List<Integer>> from the n-1 numbers, 
//in every possible position.
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length ==0) return ans;
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        ans.add(l0);
        for (int i = 1; i< nums.length; ++i){
            List<List<Integer>> new_ans = new ArrayList<List<Integer>>(); 
            for (int j = 0; j<=i; ++j){            
               for (List<Integer> l : ans){
                   List<Integer> new_l = new ArrayList<Integer>(l);
                   new_l.add(j,nums[i]);
                   new_ans.add(new_l);
               }
            }
            ans = new_ans;
        }
        return ans;
    }
}