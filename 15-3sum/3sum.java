class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort first
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(arr);

                    // Skip duplicate j
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }
            }
        }

        return ans;
    }
}
