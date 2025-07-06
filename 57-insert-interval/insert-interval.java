class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] newarr=new int[n+1][2];
        for(int i=0;i<n;i++)
            newarr[i]=intervals[i];
        newarr[n]=newInterval;
        Arrays.sort(newarr,(a,b)->a[0]-b[0]);
        int start=newarr[0][0],end=newarr[0][1];
        ArrayList<int[]> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(newarr[i][0]<=end){
                end=Math.max(end,newarr[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=newarr[i][0];
                end=newarr[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
        
        
    }
}