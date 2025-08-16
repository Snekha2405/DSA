class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";  // remove all digits case

        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // Remove extra digits if k still remains
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build result from stack
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString().isEmpty() ? "0" : sb.toString();
    }
}
