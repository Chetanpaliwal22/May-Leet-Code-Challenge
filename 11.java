/*
Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: 
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.
*/

class Solution {
    int color =0;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image.length ==0 ){
            return image;
        }
        color = image[sr][sc];
        bfs(image,sr,sc,newColor);
        
        return image;
    }
    
    public void bfs(int[][] image,int i,int j,int newColor){
    if(i>=0 && j>=0 && i<image.length && j<image[0].length){
        if(image[i][j] != color || image[i][j] == newColor){
            return;
        }else{
         image[i][j]= newColor;
            bfs(image,i,j+1,newColor);
            bfs(image,i+1,j,newColor);
            bfs(image,i-1,j,newColor);
            bfs(image,i,j-1,newColor);
         
        }
    }
      return;  
    }
    
    }
