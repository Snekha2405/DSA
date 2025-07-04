class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:magazine.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(char c:ransomNote.toCharArray()){
            if(!map.containsKey(c))
                return false;
            if(map.get(c)==1)
                map.remove(c);
            else
            map.put(c,map.get(c)-1);
        }
        return true;
        
    }
}