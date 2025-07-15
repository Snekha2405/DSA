class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)
            heap.offer(num);
        
        for(int i=1;i<k;i++)
            heap.poll();
        return heap.poll();
        
    }
}