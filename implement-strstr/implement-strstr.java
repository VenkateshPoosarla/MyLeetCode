class Solution {
    public int strStr(String haystack, String needle) {
        char hs[]=haystack.toCharArray();
        char ns[]=needle.toCharArray();
        if(ns.length==0) return 0;
        if(ns.length>hs.length) return -1;
        for(int i=0;i<hs.length;i++){
            if(hs[i]==ns[0]){
                int left=i;
                int count=0;
                for(int j=0;j<ns.length && left<hs.length;j++){
                    if(hs[left++]!=ns[j]) break;
                    count++;
                }
                
                if(count==ns.length) return i;
            }
        }
        return ns.length==0?0:-1;
    }
}