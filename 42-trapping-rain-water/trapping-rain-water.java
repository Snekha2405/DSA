class Solution {
    public int trap(int[] height) {
        int p1=0,p2=height.length-1,lmax=0,rmax=0,total=0;
        while(p1<p2){
           if(height[p1]<height[p2]){
                if(height[p1]>=lmax)
                    lmax=height[p1];
                else
                    total+=lmax-height[p1];
                p1++;
           }
           else{
                if(height[p2]>=rmax)
                    rmax=height[p2];
                else
                    total+=rmax-height[p2];
                p2--;
            }
        }
        return total;
        
    }
}