//Brute Force

class Solution {
    public int countSquares(int[][] matrix) {
        //edge case
        if(matrix.length ==0) return 0;
        
        int row = matrix.length;
        int col = matrix[0].length;
        int result = 0;
        int squareMatPossible = Math.min(row,col);
        int k = 1;
        while(k <= squareMatPossible){ 
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int sum =0;
                    for (int p = i; p < k+i; p++){ 
                        for (int q = j; q < k+j; q++){
                            //System.out.println(p +" "+q);
                            if(p<row && q < col && matrix[p][q] == 1){
                                sum +=matrix[p][q];  
                            }
                        }
                    }
                    if(k == 1 && sum == k){
                        //System.out.println(1);
                      result++;  
                    }else if(k >1 && sum == (k*k)){
                        //System.out.println(k);
                        result++;
                    }
                }
            }
            k++;
        }
        return result;
    }
}

//DP

class Solution {
    public int countSquares(int[][] matrix) {
        //edge case
        if(matrix.length ==0) return 0;
        
        int mat[][] = new int[matrix.length + 1][matrix[0].length + 1];
        int sum = 0;
        
        for(int i = 1; i <= matrix.length; i++)
            for(int j = 1; j <= matrix[0].length; j++)
                if(matrix[i - 1][j - 1] != 0){
                    mat[i][j] = Math.min(Math.min(mat[i - 1][j], mat[i][j - 1]), mat[i - 1][j - 1])+1;
                     sum += mat[i][j];
                }
        return sum;
    }
}
