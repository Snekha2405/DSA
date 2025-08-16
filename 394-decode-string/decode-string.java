class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        // String output="";
        for(char c:s.toCharArray()){
            if(c!=']')
                stack.push(String.valueOf(c));
            else{
                String a="";
                while(!stack.peek().equals("["))
                    a=stack.pop()+a;
                stack.pop();
                String num="";
                 while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0)))
                    num=stack.pop()+num;

                int n=Integer.parseInt(num);
                String b=a.repeat(n);
                stack.push(b);
        }
        }
        String a="";
        while(!stack.isEmpty())
            a=stack.pop()+a;
            
        return a;

        
    }
}