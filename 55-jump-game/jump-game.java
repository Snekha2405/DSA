class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;  // max index we can reach

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;  // current index is unreachable
            }
            maxReach = Math.max(maxReach, i + nums[i]);  // update the farthest reachable index
        }

        return true;  // we can reach or go beyond the last index
    }
}
