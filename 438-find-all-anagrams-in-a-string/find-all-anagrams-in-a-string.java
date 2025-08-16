class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    if(s.length()<p.length()) return new ArrayList<>();
    int freq1[]=new int[26];
    for(char c:p.toCharArray())
        freq1[c-'a']++;
    int freq2[]=new int[26];
    for(int i=0;i<p.length();i++)
        freq2[s.charAt(i)-'a']++;
    List<Integer> ans=new ArrayList<>();
    if(Arrays.equals(freq1,freq2)) ans.add(0);
    int left=0;
    for(int right=p.length();right<s.length();right++){
        freq2[s.charAt(right)-'a']++;
        freq2[s.charAt(left)-'a']--;
        left++;
        if(Arrays.equals(freq1,freq2)) ans.add(left);
    }
    return ans;
        
            


        
    }
}