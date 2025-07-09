class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,count=0;
        if(k<=1)
            return 0;
        int prod=1;
        for(int r=0;r<nums.length;r++){
            prod=prod*nums[r];
            while(prod>=k){
                prod=prod/nums[l];
                l++;
            }
            count+=(r-l+1);
        }
        return count;
        
    }
}