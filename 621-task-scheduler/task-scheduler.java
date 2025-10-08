import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Count frequency of each task
        int[] freq = new int[26];
        for (char c : tasks)
            freq[c - 'A']++;

        // Step 2: Build a max-heap (store only non-zero frequencies)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq)
            if (f > 0) maxHeap.offer(f);

        // Step 3: Track time
        int time = 0;

        // Step 4: Process until heap is empty
        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;

            // Step 5: Process one full cycle
            while (cycle > 0 && !maxHeap.isEmpty()) {
                int curr = maxHeap.poll();
                curr--; // execute once
                if (curr > 0) temp.add(curr); // if tasks remain, add to cooldown list
                time++;
                cycle--;
            }

            // Step 6: Push remaining (cooling) tasks back to heap
            for (int t : temp)
                maxHeap.offer(t);

            // Step 7: If heap is not empty → still more tasks left → add idle time
            if (!maxHeap.isEmpty())
                time += cycle; // fill idle slots
        }

        return time;
    }
}
