class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0 || grid == null)
            return 0;
        
        int nr = grid.length;
        int nc = grid[0].length;
        int no_of_Island = 0;
        
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(grid[i][j] == '1')
                {
                    no_of_Island++;
                    helper(grid,i,j);
                }
            }
        }
        return no_of_Island;
    }
    
    public void helper(char[][] grid, int r,int c)
    {
        int nr = grid.length;
        int nc = grid[0].length;
        
        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c] =='0' || grid[r][c] =='2')
            return;
        
        grid[r][c] = '2';
        helper(grid,r-1,c);  //top
        helper(grid,r+1,c);  //bottom
        helper(grid,r,c-1);  //left
        helper(grid,r,c+1);  //right
        
    }
}
