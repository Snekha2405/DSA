class Solution {
    public int findClosest(int x, int y, int z) {
        int dis1=Math.abs(x-z);
        int dis2=Math.abs(y-z);
        if(dis1<dis2) return 1;
        if(dis1==dis2) return 0;
        return 2;
        
    }
}