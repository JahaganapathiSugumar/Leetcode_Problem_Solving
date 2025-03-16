class Solution {
    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int [][]dp = new int[n+1][m+1];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,0,n,m,dp,grid);
    }

    public int solve(int i ,int j,int n,int m,int [][]dp,int grid[][]){

        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }

        if(i == n - 1 && j == m - 1){
            return grid[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        else{
            dp[i][j] = Math.min(solve(i+1,j,n,m,dp,grid),solve(i,j+1,n,m,dp,grid)) + grid[i][j];
            return dp[i][j];
        }
        
    }

}