class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int l=0;
        int sum=0,max=0;
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;

            }
            set.add(nums[r]);
            sum+=nums[r];
            if(sum>max)
                max=sum;

        }
        return max;
        
        
    }
}