public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        
       for(String str:strs){
           int size=str.length();
           String preifix=""+size;
           if(size<100){
               preifix="0"+preifix;
           }if(size<10){
              preifix="0"+preifix; 
           }
           sb.append(preifix).append(str);
       }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> li=new ArrayList<>();
        while(s.length()>0)
        {
            int x=Integer.parseInt(s.substring(0,3));
            li.add(s.substring(3,3+x));
            s=s.substring(3+x);
            }
        return li;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));