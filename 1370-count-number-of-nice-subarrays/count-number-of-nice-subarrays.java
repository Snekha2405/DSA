class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int c = 0;       // count of odd numbers
        int ans = 0;
        int l = 0;
        int prefixEven = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) {
                c++;               // count odd numbers
                prefixEven = 0;    // reset prefixEven when a new odd is found
            }

            while (c > k) {        // shrink window when too many odds
                if (nums[l] % 2 == 1) c--;
                l++;
                if (c == k) prefixEven = 0;  // reset when we reach k odds again
            }

            while (c == k && nums[l] % 2 == 0) {
                prefixEven++;      // count leading even numbers that can shift start
                l++;
            }

            if (c == k) ans += 1 + prefixEven;
        }
        return ans;
    }
}
