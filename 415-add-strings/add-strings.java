class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;
        while(i>=0&&j>=0){
        int sum=Character.getNumericValue(num1.charAt(i))+Character.getNumericValue(num2.charAt(j))+carry;
        carry=sum/10;
        sum=sum%10;
        sb.append(sum);
        --i;
        --j;
        System.out.println(carry);
    }
    while(i>=0)

    {
        int sum=Character.getNumericValue(num1.charAt(i))+carry;
        carry=sum/10;
        sum=sum%10;
        sb.append(sum);
        --i;

        
    }
    while(j>=0)

    {
        int sum=Character.getNumericValue(num2.charAt(j))+carry;
        carry=sum/10;
        sum=sum%10;
        sb.append(sum);
        --j;

        
    }
    if(carry==1)
        sb.append(carry);
        sb.reverse();
        return sb.toString();

        
    }
}