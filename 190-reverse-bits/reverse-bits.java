class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        // Step 2: Reverse string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        
        return (int)Long.parseLong(sb.toString(), 2);
        
        
    }
}