import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort children's greed
        Arrays.sort(s); // Sort cookies' sizes

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // If the cookie can satisfy the child
                i++; // Move to next child
            }
            j++; // Always move to next cookie
        }
        return i; // Number of content children
    }
}
