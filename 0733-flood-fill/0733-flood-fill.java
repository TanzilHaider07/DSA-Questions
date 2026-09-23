class Solution {
    public void dfs(int image[][] , int c , int color, int sr, int sc , int m , int n)
    {
        if(sr<0 || sr>=m || sc<0 || sc>=n || image[sr][sc] != c)
            return;
        
      
        image[sr][sc] = color;
    
        dfs(image,c,color,sr,sc-1,m,n);
        dfs(image,c,color,sr,sc+1,m,n);
        dfs(image,c,color,sr-1,sc,m,n);
        dfs(image,c,color,sr+1,sc,m,n);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c = image[sr][sc]; // c = earlier color
        if(c == color) return image;
        dfs(image, c , color, sr , sc , image.length ,image[0].length);
        return image; 
    }
}