class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=10;
        int tot=10;
        for(int i=2;i<=n;i++){
            dp[i]=9;
            int a=9;
            for(int j=1;j<i;j++){
                dp[i]*=a;
                --a;

            }
            tot+=dp[i];
        }
        return tot;
        
    }
}