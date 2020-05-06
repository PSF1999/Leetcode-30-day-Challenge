/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

class Solution {
    
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1;
        for(int num : nums) {
            
            count+=(ele == num)? 1:-1;
            if(count == 0) {
                ele = num;
                count = 1;
            }
        }
        return ele;
    }
}

/*
Boyer-Moore candidate voting algorithm O(n) solution with constant space
*/
