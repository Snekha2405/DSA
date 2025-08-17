class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        
        // If reshape is not possible, return original matrix
        if (n * m != r * c) return mat;
        
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr.add(mat[i][j]);
        }
        
        int[][] ans = new int[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr.get(k++);
                // ✅ now properly inside the loop
            }
        }
        
        return ans;
    }
}
