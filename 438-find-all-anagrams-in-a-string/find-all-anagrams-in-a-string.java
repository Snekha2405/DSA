class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        if (s.length() < p.length()) return arr;

        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        for (char c : p.toCharArray()) {
            pfreq[c - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            sfreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pfreq, sfreq)) {
            arr.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            // Slide window: remove leftmost, add new rightmost
            sfreq[s.charAt(i) - 'a']++;
            sfreq[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pfreq, sfreq)) {
                arr.add(i - p.length() + 1);
            }
        }

        return arr;
    }
}
