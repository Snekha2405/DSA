public class Solution {
    public int recursion(List<List<Integer>> t, int i, int j, int n, int[][] dp){
        if(i == n) return t.get(i).get(j);
        if(dp[i][j] != -1) return dp[i][j];
        int d = t.get(i).get(j) + recursion(t, i+1, j, n, dp);
        int e = t.get(i).get(j) + recursion(t, i+1, j+1, n, dp);
        return dp[i][j] = Math.min(d, e);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return recursion(triangle, 0, 0, n - 1, dp);
    }
}
