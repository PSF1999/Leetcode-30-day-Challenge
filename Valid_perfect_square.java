/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.
*/

class Solution {
    
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1)
            return true;
        long low = 2;
        long high = num/2;
        long mid = 0;
        while(low <= high) {
            mid = low + (high - low)/2;
            if(mid * mid == num)
                return true;
            else if(mid*mid < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}

/* Binary search solution with O(longN) complexity */
