class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, 0, current, ans);
        return ans;
    }

    private void backtrack(String s, int start, List<String> current, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            String str = s.substring(start, i);
            if (isPalindrome(str)) {
                current.add(str);
                backtrack(s, i, current, ans);
                current.remove(current.size() - 1); // backtrack step
            }
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
