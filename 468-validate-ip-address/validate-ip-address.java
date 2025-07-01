class Solution {
    public String validIPAddress(String queryIP) {
        if(queryIP.contains(".")){
            String str[]=queryIP.split("\\.",-1);
            if(str.length!=4)
                return "Neither";
            for(String s:str){
                if(s.isEmpty()||s.length()>3)
                    return "Neither";
                if(s.length()>1&&s.charAt(0)=='0')
                    return "Neither";
                try{
                    int n=Integer.parseInt(s);
                    if(n<0||n>255)
                        return "Neither";
                }
                catch(NumberFormatException e){
                    return "Neither";
                }
                           
                          
            }
            return "IPv4";
            
        }
        if(queryIP.contains(":")){
            String str[]=queryIP.split(":",-1);
            if(str.length!=8)
                return "Neither";
            for(String s:str){
                if(s.isEmpty()||s.length()>4)
                    return "Neither";
                if(!s.matches("[0-9a-fA-F]+"))
                    return "Neither";
                
                
                           
                          
            }
            return "IPv6";
            
        }
        return "Neither";
        
    }
}