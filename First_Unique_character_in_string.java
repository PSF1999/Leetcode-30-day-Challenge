/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
*/

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray())
            count[c-'a']++;
        int i = -1;
        while(++i < s.length())
            if(count[s.charAt(i)-'a'] == 1)
                return i;
        return -1;
    }
}

/* store count of each character in array and then return the first character with count 1*/
