import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return ans;
        int wordLen = words[0].length();
        int numWords = words.length;
        int totalLen = wordLen * numWords;
        if (s.length() < totalLen) return ans;
        // 1) Target frequency of each word we expect
        Map<String, Integer> need = new HashMap<>();
        for (String w : words) {
            need.put(w, need.getOrDefault(w, 0) + 1);
        }
        // 2) Try windows that start at each offset modulo wordLen
        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;               // left boundary of current window
            int matched = 0;                 // number of words currently matched
            Map<String, Integer> have = new HashMap<>();

            // Move right pointer in steps of wordLen
            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
                String w = s.substring(right, right + wordLen);

                if (need.containsKey(w)) {
                    // Add this word to the window
                    have.put(w, have.getOrDefault(w, 0) + 1);
                    matched++;

                    // If we have too many of this word, shrink from left
                    while (have.get(w) > need.get(w)) {
                        String leftWord = s.substring(left, left + wordLen);
                        have.put(leftWord, have.get(leftWord) - 1);
                        left += wordLen;
                        matched--;
                    }

                    // If we matched exactly numWords words, record an answer
                    if (matched == numWords) {
                        ans.add(left);

                        // Slide by one word to look for the next candidate
                        String leftWord = s.substring(left, left + wordLen);
                        have.put(leftWord, have.get(leftWord) - 1);
                        left += wordLen;
                        matched--;
                    }
                } else {
                    // Word not in need: reset window
                    have.clear();
                    matched = 0;
                    left = right + wordLen;
                }
            }
        }

        return ans;
    }
}
