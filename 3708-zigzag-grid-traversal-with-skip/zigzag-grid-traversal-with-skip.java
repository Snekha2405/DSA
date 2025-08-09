class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j+=2)
                    ans.add(grid[i][j]);
            }
            else{
                List<Integer> arr=new ArrayList<>();
                for(int j=1;j<m;j+=2)
                    arr.add(grid[i][j]);
                Collections.reverse(arr);
                ans.addAll(arr);
            }
        }
        
        return ans;
    }
}