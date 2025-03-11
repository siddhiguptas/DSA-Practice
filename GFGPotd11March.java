class Solution {
    int f(int n,int dp[]){
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        
        return dp[n]=f(n-1,dp)+f(n-2,dp);
    }
    int countWays(int n) {
        // your code here
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return f(n,dp);
        
    }
}
