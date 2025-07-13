class Solution {
    public int trailingZeroes(int n) {
        if(n<0 || n==0)
            return 0;
        int c=0;
        while(n>=5){
            c+=n/5;
            n/=5;
        }
        return c;
        
    }
}