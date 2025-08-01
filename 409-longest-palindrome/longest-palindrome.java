class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int strlen=0,oddlen=0;
        for(int count:map.values())
        {
            if(count%2==0)
                strlen+=count;
            else if(count%2==1){
                strlen+=count-1;
                oddlen=1;
            }
            
        }
        if(oddlen==1)
            strlen++;
        return strlen;
    }
}