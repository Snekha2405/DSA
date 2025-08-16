class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxLen=0,maxCount=0,left=0;
        for(int right=0;right<s.length();right++)    // pa
        {
            int index=s.charAt(right)-'A';
            freq[index]++;
            // System.out.println("Right:"+right);
            // System.out.println("FreqCount:"+s.charAt(right)+"-"+freq[index]);
            maxCount=Math.max(maxCount,freq[index]);
            // System.out.println("MaxCount:"+maxCount);
            // System.out.println("right-left+1-maxCount:"+(right-left+1-maxCount));
            while(right-left+1-maxCount>k)
            {
            // System.out.println("Ulla poiduchu right-left+1-maxCount "+(right-left+1-maxCount+"irukamodhu"));
                freq[s.charAt(left)-'A']--;
            // System.out.println("freq[s.charAt(left)-'A']-- pana aprm "+freq[s.charAt(left)-'A']);
                left++;
            // System.out.println("Left:"+left);
            }
            maxLen=Math.max(maxLen,right-left+1);
            // System.out.println("maxLen:"+maxLen);
        }
        return maxLen;
    }
}