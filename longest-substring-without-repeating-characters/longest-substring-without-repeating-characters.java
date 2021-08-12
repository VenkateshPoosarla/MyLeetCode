class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index[]=new int[256];
       
        Arrays.fill(index,-1);
        int start=0;
        int len=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if( index[ch[i]]>=start){
                start=index[ch[i]]+1;
            }
              index[ch[i]]=i;
              len=Math.max(i-start+1,len);
        }
     return len;
    }
}