class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0,maxlen=0;
        while(r<nums.length){
            if(nums[r]==0)
                l=r+1;
            r++;
            if((r-l)>maxlen)
                maxlen=r-l;
        
        }
        return maxlen;



        
    }
}