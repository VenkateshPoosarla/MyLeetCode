class Solution {
    public String longestPalindrome(String s) {
        String lp="";
        for(int i=0;i<s.length();i++){
            String left=maxSize(i,i,s);
            String right=maxSize(i,i+1,s);
            if(left.length()>right.length()){
                if(left.length()>lp.length()){
                    lp=left;
                }
            }else{
              if(right.length()>lp.length()){
                    lp=right;
                }  
            }
        }
        return lp;
    }
    String maxSize(int l,int r,String s){
        String str="";
        while(l>=0 && r<=s.length()-1){
            if(s.charAt(l)==s.charAt(r)){
                if(l==r){
                    str=str+s.charAt(l);
                }else{
                    str=s.charAt(l)+str+s.charAt(r);
                }
            }else{
                break;
            }
            l--;
            r++;
        }
        return str;
    }
}