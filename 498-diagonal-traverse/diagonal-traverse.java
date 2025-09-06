class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map.containsKey(i+j))
                  map.get(i+j).add(mat[i][j]);
                else{
                    List<Integer> arr=new ArrayList<>();
                    arr.add(mat[i][j]);
                    map.put(i+j,arr);
                }
            }

        }
         List<Integer> resultList = new ArrayList<>();
       for (int k = 0; k <= n + m - 2; k++) {
            List<Integer> diag = map.get(k);
            if (k % 2 == 0) {  
                // Reverse order for even diagonals
                Collections.reverse(diag);
            }
            resultList.addAll(diag);
        }

        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;

        
    }
}