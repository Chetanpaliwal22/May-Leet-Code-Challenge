/*Input: J = "aA", S = "aAAbbbb"
Output: 3
    
Input: J = "z", S = "ZZ"
Output: 0*/
    
class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.length() ==0 || S.length() == 0){
            return 0;
        }
        int count =0;
        for(int i=0;i<J.length();i++){
            char ithChar = J.charAt(i); 
            for(int j=0;j<S.length();j++){
                if(ithChar == S.charAt(j)){
                    count++; 
                }
            }
        }
        return count;
    }
}
