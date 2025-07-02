class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> m=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            else if(m.containsKey(t.charAt(i))&&m.get(t.charAt(i))!=s.charAt(i))
                return false;
                
                    
            else{
                    map.put(s.charAt(i),t.charAt(i));
                    m.put(t.charAt(i),s.charAt(i));
            }
            

        }
        return true;
        
    }
}