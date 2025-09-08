class Solution {
    public static boolean check(int n){
        if(String.valueOf(n).contains("0"))
            return false;
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int ans[]=new int[2];

        for(int i=1;i<n;i++){
            int j=n-i;
            if(check(j)&&check(i)){
                ans[0]=j;
                ans[1]=i;
                return ans;
            }
        }
        return ans;
        

    }
}