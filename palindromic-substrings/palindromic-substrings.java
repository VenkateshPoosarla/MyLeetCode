class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
           count+=palindromeCount(i,i+1,s);
           count+=palindromeCount(i,i,s);
        }
        return count;
    }
    int palindromeCount(int l,int r,String s){
        int count=0;
        while(l>=0 && r<=s.length()-1){
            if(s.charAt(l--)==s.charAt(r++)){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}