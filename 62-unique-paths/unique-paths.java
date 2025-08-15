class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(0, 0, m, n, dp);
    }

    int helper(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) return 1; // reached destination
        if (i >= m || j >= n) return 0;         // out of bounds
        if (dp[i][j] != -1) return dp[i][j];    // already computed

        int down = helper(i + 1, j, m, n, dp);
        int right = helper(i, j + 1, m, n, dp);

        return dp[i][j] = down + right;         // store and return
    }
}
