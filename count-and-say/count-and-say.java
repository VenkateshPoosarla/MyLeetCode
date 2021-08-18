class Solution {
    public String countAndSay(int n) {
       String str[]=new String[n+1];
        str[1]="1";
        for(int i=2;i<str.length;i++)
            str[i]=nextnum(str[i-1]);
        return str[n];
    }
    String nextnum(String x){
       char ch[]=x.toCharArray();
        
        char prev=ch[0];
        int count=1;
        StringBuilder sb=new StringBuilder();
        // count++;
        for(int i=1;i<ch.length;i++){
            if(prev==ch[i]){
                count++;
            }else{
                sb.append(count).append(prev);
                prev=ch[i];
                count=1;
            }
        }
        return sb.append(count).append(prev).toString();
    }
}