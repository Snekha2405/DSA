class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int res[]=new int[n*m];
        int row=0,col=0;
        for(int i=0;i<n*m;i++){
            res[i]=mat[row][col];
            if((row+col)%2==0){
            if(row>0 && col<m-1){
                row--;
                col++;
            }
            else if(row==0 && col<m-1) col++;
            else row++;  
        }
        else{
            if(row<n-1 && col>0){
                row++;
                col--;
            } 
            else if(col==0 && row<n-1) row++;   
            else col++;   
        }
        }
        return res;

        
    }
}