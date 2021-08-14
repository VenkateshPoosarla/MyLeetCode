class Solution {
     public String licenseKeyFormatting(String s, int k) {
       s=s.replace("-","");
       int first=s.length()%k;
       StringBuilder sb=new StringBuilder();
       sb.append(s.substring(0,first));
        if(first!=0 && first!=s.length())
            sb.append("-");
        int count=0;
       for(int i=first;i<s.length();i++){
           if(count==k){
               sb.append("-");
               count=0;
           }
           sb.append(s.charAt(i));
           count++;
       }
       return sb.toString().toUpperCase();
       
            
    }
}