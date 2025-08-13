class Solution {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        for (int stone : stones) {
            dp.put(stone, new HashSet<>());
        }

        // Step 2: The frog starts at position 0 with jump size 0
        dp.get(0).add(0);

        // Step 3: Iterate through stones in ascending order
        for (int stone : stones) {
            for (int jump : dp.get(stone)) {
                // Try jumps of size jump-1, jump, jump+1
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && dp.containsKey(stone + nextJump)) {
                        dp.get(stone + nextJump).add(nextJump);
                    }
                }
            }
        }

        // Step 4: If the last stone's set is non-empty, frog can reach it
        return !dp.get(stones[stones.length - 1]).isEmpty();
        
    }
}