class Solution {
    public String convert(String s, int numRows) {
        ArrayList al[]=new ArrayList[numRows];
        if(numRows==1) return s;
        for(int i=0;i<numRows;i++){
            al[i]=new ArrayList<Character>();
        }
        boolean flag=true;
        int counter=0;
        for(char ch:s.toCharArray()){
            if(flag){
                al[counter++].add(ch);
            }else{
                al[counter--].add(ch);
            }
            if(counter==numRows)
            {
                counter=counter-2;
                flag=false;
            }
            
            if(counter==-1){
               counter=counter+2;
               flag=true;}
        }
        // split to join the rows
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            List<Character> li=al[i];
            for(Character ch: li){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}