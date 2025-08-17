class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] dist = new int[n][m];
        int INF = n + m; // maximum possible distance in grid

        // Step 1: initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = mat[i][j] == 0 ? 0 : INF;
            }
        }

        // Step 2: forward pass (top-left → bottom-right)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != 0) {
                    if (i > 0) dist[i][j] = Math.min(dist[i][j], dist[i-1][j] + 1);
                    if (j > 0) dist[i][j] = Math.min(dist[i][j], dist[i][j-1] + 1);
                }
            }
        }

        // Step 3: backward pass (bottom-right → top-left)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    if (i < n - 1) dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    if (j < m - 1) dist[i][j] = Math.min(dist[i][j], dist[i][j+1] + 1);
                }
            }
        }

        return dist;
    }
}
