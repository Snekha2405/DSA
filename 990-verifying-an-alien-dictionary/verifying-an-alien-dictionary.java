
import java.util.*;

public class Solution{
    public boolean isAlienSorted(String[] words, String order) {
        // Step 1: Build order map
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }

        // Step 2: Compare each adjacent pair of words
        for (int i = 0; i < words.length - 1; i++) {
            if (!inCorrectOrder(words[i], words[i + 1], orderMap)) {
                return false;
            }
        }
        return true;
    }

    private boolean inCorrectOrder(String w1, String w2, int[] orderMap) {
        int len = Math.min(w1.length(), w2.length());
        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if (c1 != c2) {
                if (orderMap[c1 - 'a'] > orderMap[c2 - 'a']) {
                    return false; // wrong order
                } else {
                    return true; // correct order
                }
            }
        }

        // If all characters matched but lengths differ, shorter one should come first
        return w1.length() <= w2.length();
    }
}