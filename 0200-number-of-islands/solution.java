class Solution {
    public int numIslands(char[][] grid) {
        // no of rows
        int rows = grid.length;
        //boundary condition if grid is empty
        if (rows == 0)
            return 0;
        //no of columns
        int cols = grid[0].length;
        
        int no_of_islands = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j] == '1')
                {
                    markIslands(grid,i,j,rows,cols);
                    no_of_islands += 1;
                }
            }
        }
        return no_of_islands;
    
    }
    
    public void markIslands(char[][] matrix,int x,int y,int r,int c)
    {
        if(x<0 || x>=r || y<0 || y>=c || matrix[x][y] != '1')
            return;
        matrix[x][y] = '2';
        
        markIslands(matrix,x-1,y,r,c);
        markIslands(matrix,x,y+1,r,c);
        markIslands(matrix,x+1,y,r,c);
        markIslands(matrix,x,y-1,r,c);
            
    }
}
