/*
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
*/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double slope = (double)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        for(int i=2;i<coordinates.length;i++){
            double currSlope = (double)(coordinates[i][1]-coordinates[0][1])/(coordinates[i][0]-coordinates[0][0]);
            if(slope != currSlope){
                return false;
            }
        }
        return true;
    }
}
