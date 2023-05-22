import java.util.*;

// link : https://leetcode.com/problems/two-sum/

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/
class problems{
    
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution1.twoSum(nums,2)));
        System.out.println(Arrays.toString(solution2.twoSum(nums,2)));
        
    }
}

class Solution1 {

    // space complexity :this fuction creates int new array of size 2. This array has constant size and does not depend on the input size so the space complexity is O(1)

    /* time complexity :
        for inner loop takes n+1 
        outer loop takes n-1
        for loop inside for loop so (n+1)(n-1) we can ignore constants so n * n = n^2

        so O(n^2)

    */
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for ( int i = 0; i < nums.length - 1 ; i++){
            int find = target - nums[i];
            for (int j = i + 1 ; j < nums.length ; j++ ){
                if ( find == nums[j]){
                   
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return newArr;
    }
}
class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        /*
            Space complexity = 
                The function uses a HashMap to store the numbers and their indices. In the worst case, if all elements in nums are unique, the HashMap can store up to nums.length key-value pairs.
                Therefore, the space complexity of the function is O(n), where n is the size of the nums array.

                spca comp = O (n)


            Time Complexity = 
                Hash Map loop =  n 
                searching     =  n 
                look up for hash map is o(1)

                so = (n + n * 1) = 2n = n 
                time complex = o(n)
         */
        HashMap <Integer, Integer> map = new HashMap();

        // Fill hash map
        for(int i=0; i<= nums.length-1 ; i++ ){
            map.put(nums[i],i);
        }

        // Searching
        for(int i=0; i<= nums.length-1 ; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i)continue;
                return new int[]{i, index};
            }
        }
        return new int []{};
    }
}