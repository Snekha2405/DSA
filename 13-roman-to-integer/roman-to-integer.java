class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) { 
            int val = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (val < prev) {
                ans -= val; 
            } else {
                ans += val;
            }
            prev = val;
        }
        return ans;
    }
}
