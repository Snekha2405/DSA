class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int m=0,l=0,r=0;
        while(r<s.length()){
           while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
           }
           set.add(s.charAt(r));
            m=m>(r-l+1)?m:(r-l+1);
            r++;
            
            
        }
        return m;
        
    }
}