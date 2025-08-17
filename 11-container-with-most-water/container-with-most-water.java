class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1,h,m=0;
        while(l<r){
            if(height[r]<height[l]){
                h=height[r]*(r-l);
                --r;
            }
            else{
                h=height[l]*(r-l);
                l++;
            }

            m=m>h?m:h;
            
        }
        return m;
        
    }
}