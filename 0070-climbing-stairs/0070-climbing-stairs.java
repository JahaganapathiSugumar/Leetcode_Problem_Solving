class Solution {
    public static int []dp = new int[46];
    static{Arrays.fill(dp,-1);}
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        else{
            return dp[n] = climbStairs(n-1) + climbStairs(n - 2);
        }

    }
}