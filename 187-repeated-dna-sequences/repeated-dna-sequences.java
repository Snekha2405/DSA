class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set=new HashSet<>();
        if(s.length()<10)
            return new ArrayList<>();
        Set<String> arr=new HashSet<>();
        
        for(int i=0;i<s.length()-9;i++)
        {
            String substr=s.substring(i,i+10);
            if(!set.add(substr))
                arr.add(substr);

        }
        return new ArrayList<>(arr);

        
    }
}