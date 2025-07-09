class Solution {
    public int longestBeautifulSubstring(String word) {
        int l=0,vowel=1,maxlen=0;
        for(int r=1;r<word.length();r++){
            if(word.charAt(r-1)<word.charAt(r)){
                vowel++;
            }
            else if(word.charAt(r-1)>word.charAt(r)){
                vowel=1;
                l=r;

            }
            if(vowel==5)
            {
                maxlen=Math.max(maxlen,(r-l+1));
            }

        }
        return maxlen;
        
        
    
        
    }
}