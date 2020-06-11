Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.


class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length - 1;
        int mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}