class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int i:stones)
            map.put(i,new HashSet<>());
        map.get(0).add(0);
        for(int stone:stones){
            for(int jump:map.get(stone)){
                for(int nextjump=jump-1;nextjump<=jump+1;nextjump++){
                    if(nextjump>0&&map.containsKey(stone+nextjump))
                        map.get(stone+nextjump).add(nextjump);
                }
            }
            System.out.println(map.get(stone));
        }
        if(map.get(stones[stones.length-1]).isEmpty())
            return false;
        return true;

        
        
    }
}