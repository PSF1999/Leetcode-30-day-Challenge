/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26];
        
        for(char m : magazine.toCharArray())
            count[m-'a']++;
        
        for(char r : ransomNote.toCharArray())
            if(--count[r-'a'] < 0)
                return false;
        
        return true;
    }
}

/*
frequency of each character in ransom note should be equal to frequency those particular characters in magazine
*/
