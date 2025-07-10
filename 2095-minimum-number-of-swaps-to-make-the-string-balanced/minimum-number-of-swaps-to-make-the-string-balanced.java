class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>(); 
        
        for (char i : s.toCharArray()){
           

            if (i == '[')
                st.push(i); // Push opening bracket to the stack
            else if (!st.isEmpty() && st.peek() == '[')
                st.pop(); // Excluding balanced pairs
            else
                st.push(i); // Push closing bracket to the stack
           
        }
        
        int unbalancedPairs = st.size() / 2;
        int swaps = (int) Math.ceil(unbalancedPairs / 2.0);
        return swaps;
    }
}