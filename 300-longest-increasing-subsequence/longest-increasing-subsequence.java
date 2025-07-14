class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=Collections.binarySearch(arr,nums[i]);
            if(j<0){
                j=-(j+1);
            }
            if(j<arr.size())
                arr.set(j,nums[i]);
            else
                arr.add(nums[i]);


        }
        return arr.size();

        
    }
}