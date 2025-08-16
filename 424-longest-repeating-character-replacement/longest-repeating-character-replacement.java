class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxLen=0,maxCount=0,left=0;
        for(int right=0;right<s.length();right++)   
        {
            int index=s.charAt(right)-'A';
            freq[index]++;
            maxCount=Math.max(maxCount,freq[index]);
            while(right-left+1-maxCount>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
                maxCount=Math.max(maxCount,freq[index]);
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}