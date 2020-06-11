Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int swap = 0;
        int mid = 0;
        while(mid <= high) {
            switch(nums[mid]) {
                case 0:
                    swap = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = swap;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = swap;
                    high--;
                    break;
            }
        }
    }
}