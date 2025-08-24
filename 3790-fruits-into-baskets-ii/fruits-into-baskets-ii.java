class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> list=new ArrayList<>();
        for(int i:baskets)
            list.add(i);
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list.size();j++){
                if(fruits[i]<=list.get(j))
                {
                    list.remove(list.get(j));
                    count++;
                    break;
                }
            }
        }
        return fruits.length-count;


        
    }
}