package GRIND_75;

import java.util.Hashtable;

public class Q1_TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // array to store indices
        int[] ans = new int[2];

        // hashtable to store the values as keys and indices as elements
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i=0; i<nums.length; i++){
            if (table.containsKey(target - nums[i])){
                ans[0] = table.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            else {
                ans[0] = -1;
                ans[1] = -1;
            }
            table.put(nums[i], i); // add the values from the array as keys for easy look up
        }

        return ans;
    }

    public void print(int arr[]){
        String s = "[" + arr[0] + ", " + arr[1] + "]";

        if (arr[0] == -1 && arr[1] == -1){
            System.out.println("NO TWO SUM FOUND.");
        }
        else {
            System.out.println(s);
        }

    }

    public static void main(String[] args){

        // create object
        Q1_TwoSum obj = new Q1_TwoSum();

        // test cases
        int[] nums = {2,7,11,15};
        int target = 9;
        obj.print(obj.twoSum(nums, target));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        obj.print(obj.twoSum(nums2, target2));

        int[] nums3 = {3,3};
        int target3 = 6;
        obj.print(obj.twoSum(nums3, target3));

        int[] nums4 = {3,4};
        int target4 = 6;
        obj.print(obj.twoSum(nums4, target4));
    }
}

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
* */
