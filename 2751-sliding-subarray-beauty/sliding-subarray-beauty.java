class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
       int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] freq = new int[51]; // for negatives from -50 to -1

        int left = 0;
        for (int right = 0; right < n; right++) {
            // Add new element if negative
            if (nums[right] < 0) {
                freq[-nums[right]]++;
            }

            // Maintain window size k
            if (right - left + 1 > k) {
                if (nums[left] < 0) {
                    freq[-nums[left]]--;
                }
                left++;
            }

            // When window size == k
            if (right - left + 1 == k) {
                int count = 0;
                int beauty = 0;
                for (int i = 50; i >= 1; i--) {
                    count += freq[i];
                    if (count >= x) {
                        beauty = -i;
                        break;
                    }
                }
                result[left] = beauty;
            }
        }

        return result;


        
    }
}