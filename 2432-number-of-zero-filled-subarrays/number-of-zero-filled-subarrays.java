class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if (nums[right] == 0) {
                // number of zero-subarrays ending at 'right' 
                ans += (right - left + 1);
            } else {
                // reset window start after a non-zero
                left = right + 1;
            }


        }
        return ans;
        
    }
}