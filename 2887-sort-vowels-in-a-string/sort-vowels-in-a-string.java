import java.util.*;

class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        
        // Collect vowels
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        
        // Sort vowels
        Collections.sort(vowels);
        
        // Build new string
        StringBuilder sb = new StringBuilder();
        int j = 0; // pointer for sorted vowels
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(vowels.get(j++)); // replace with sorted vowel
            } else {
                sb.append(c); // keep consonant/special char as is
            }
        }
        return sb.toString();
    }
    
    // helper method
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
