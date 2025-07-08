class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        if (s.length() < p.length()) return arr;
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for (char c : p.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            freq2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) {
            arr.add(0);
        }
        int l=0;
        for (int i = 1; i <=s.length()-p.length(); i++) {
            freq2[s.charAt(l) - 'a']--;
            freq2[s.charAt(l+p.length()) - 'a']++;

            if (Arrays.equals(freq1, freq2)) {
                arr.add(i);
            }
            l++;
        }

        return arr;
    }
}
