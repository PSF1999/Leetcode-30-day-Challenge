/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/


class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet();
        for(char j : J.toCharArray())
            set.add(j);
        int count = 0;
        for(char s : S.toCharArray())
            if(set.contains(s))
                count++;
        return count;
        
    }
}

/*
HashSet based solution with complexity O(j+s)
j = size of string J
s = size of string S
*/

