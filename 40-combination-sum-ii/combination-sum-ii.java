class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates); // ✅ Needed to handle duplicates

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        func(candidates, target, curr, ans, 0);

        return ans;
    }

    public void func(int[] candidates, int target, List<Integer> curr, List<List<Integer>> ans, int i) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(curr);
            ans.add(temp);
            return;
        }

        if (target > 0 && i < candidates.length) {
            // ✅ Loop used to skip duplicates
            for (int j = i; j < candidates.length; j++) {
                if (j > i && candidates[j] == candidates[j - 1]) continue; // skip duplicate elements

                if (candidates[j] > target) break; // pruning

                curr.add(candidates[j]);
                func(candidates, target - candidates[j], curr, ans, j + 1); // ✅ move to next index
                curr.remove(curr.size() - 1);
            }
        } else {
            return;
        }
    }
}
