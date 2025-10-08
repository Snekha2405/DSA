import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > K) maxHeap.poll(); // remove farthest
        }

        int[][] res = new int[K][2];
        int i = 0;
        while (!maxHeap.isEmpty()) res[i++] = maxHeap.poll();
        return res;
    }
}
