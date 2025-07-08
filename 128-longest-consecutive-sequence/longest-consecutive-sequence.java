class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
            set.add(n);
        int maxlen=0;
        for(int i:set){
            if(!set.contains(i-1)){
            int length=1;

            while(set.contains(i+length))
                length++;
            maxlen=Math.max(length,maxlen);
            }

        }
        return maxlen;
        
    }
}