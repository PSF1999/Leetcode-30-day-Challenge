/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length == 2)
         return true;
        
        else {
            int dy = coordinates[1][1] - coordinates[0][1];
            int dx = coordinates[1][0] - coordinates[0][0];
            int x = coordinates[0][0];
            int y = coordinates[0][1];
            for(int i = 2; i < coordinates.length; i++){
                if(dy*(coordinates[i][0] - x) != dx*(coordinates[i][1] - y))
                    return false;
            }
        }
        return true;
    }
}

/*
if there are only two points then they are on the same line
Calculate line equation using first two points.
if any point does not satisfy the equation then return false
*/ 
