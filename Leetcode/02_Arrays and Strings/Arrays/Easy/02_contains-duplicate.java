//link https://leetcode.com/problems/contains-duplicate/

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
  element is distinct.
  Example 1:
        Input: nums = [1,2,3,1]
        Output: true
 */


import java.util.Arrays;
import java.util.HashMap;

class problems2{

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.containsDuplicate(nums));
    }

}

class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }
}
