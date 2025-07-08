class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s1 = s.length() - 1;
        int s2 = t.length() - 1;

        while (s1 >= 0 || s2 >= 0) {
            int b1 = 0, b2 = 0;

             while (s1 >= 0) {
                if (s.charAt(s1) == '#') {
                    b1++;
                    s1--;
                } else if (b1 > 0) {
                    b1--;
                    s1--;
                } 
                else 
                    break;
                
            }

            
            while (s2 >= 0) {
                if (t.charAt(s2) == '#') {
                    b2++;
                    s2--;
                } 
                else if (b2 > 0) {
                    b2--;
                    s2--;
                } 
                else 
                    break;
                
            }

            
            if (s1 >= 0 && s2 >= 0) {
                if (s.charAt(s1) != t.charAt(s2)) 
                    return false;
            } 
            else if(s1 >= 0 || s2 >= 0) return false;
            

            s1--;
            s2--;
        }

        return true;
    }
}
