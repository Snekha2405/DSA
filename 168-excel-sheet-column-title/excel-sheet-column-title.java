class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char c=(char)('A'+rem);
            sb.append(c);
            columnNumber/=26;
        }
        sb.reverse();
        return sb.toString();
        
    }
}