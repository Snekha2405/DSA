class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int m=0,l=0,r=0;
        while(r<s.length()){
            while(r<s.length()&&!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            m=m>(r-l)?m:(r-l);
            l++;
            r=l;
            set.clear();
            
        }
        return m;
        
    }
}