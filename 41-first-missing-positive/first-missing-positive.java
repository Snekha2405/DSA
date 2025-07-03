class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0&&nums[i]<=n&&nums[nums[i]-1]!=nums[i]){
                int a=nums[i];
                int temp=nums[i];
                nums[i]=nums[a-1];
                nums[a-1]=temp;
                
            }
        }
        for(int i=0;i<n;i++){
            if(i+1 !=nums[i])
                return i+1;
        }
        return n+1;

        
    }
}