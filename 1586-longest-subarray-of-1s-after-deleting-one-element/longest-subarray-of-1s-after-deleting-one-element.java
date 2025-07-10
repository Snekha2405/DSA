class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0,l=0,m=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)
                curr++;
            while(curr>1){
                if(nums[l]==0)
                    --curr;
                l++;
            }
            if(curr<=1)
                m=m>(r-l)?m:r-l;
            
        }
        return m;
        
    }
}