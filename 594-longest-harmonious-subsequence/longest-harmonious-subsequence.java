class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int j=nums.length-1;
            while(j>i&&(nums[j]-nums[i])!=1)
                --j;
            if(nums[j]-nums[i]==1)
                maxlen=Math.max(maxlen,j-i+1);
           
        }
        return maxlen;
        
        
    }
}