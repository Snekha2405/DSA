class Solution {
    public int minimumCardPickup(int[] cards) {
        Set<Integer> set=new HashSet<>();
        int maxlen=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<cards.length;right++){
           while (set.contains(cards[right])) {
                
                maxlen = Math.min(maxlen, right - left + 1);
                set.remove(cards[left]);
                left++;
            }
            set.add(cards[right]);

        }
        if(maxlen==Integer.MAX_VALUE)
            return -1;
        return maxlen;
    }
}