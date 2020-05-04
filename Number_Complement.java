/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
*/

class Solution {
    
    public int findComplement(int num) {
        
        String binary = Integer.toBinaryString(num);
        StringBuilder compBinary = new StringBuilder();
        
        for(char bin : binary.toCharArray())
            compBinary.append((bin == '1')? "0" : "1");
        
        return Integer.parseInt(compBinary.toString(),2);
    }
}


