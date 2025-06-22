class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
            map.put(i,map.getOrDefault(i,0)+1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i)){
                int a=map.get(i);
                ans.add(i);
                if(a==1)
                    map.remove(i);
                else
                    map.put(i,--a);
            }
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            res[i]=ans.get(i);
        return res;
        
    }
}