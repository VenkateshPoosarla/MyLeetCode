class Solution {
    public List<String> letterCombinations(String digits) {
    char ch[]=digits.toCharArray();
        List<String> li=new ArrayList<>();
        Map<Integer,List<String>> map=new HashMap<>();
        map.put(2,List.of("a","b","c"));
        map.put(3,List.of("d","e","f"));
        map.put(4,List.of("g","h","i"));
        map.put(5,List.of("j","k","l"));
        map.put(6,List.of("m","n","o"));
        map.put(7,List.of("p","q","r","s"));
        map.put(8,List.of("t","u","v"));
        map.put(9,List.of("w","x","y","z"));
     for(int i=0;i<ch.length;i++){
         li=makeCombination(li,map.get(ch[i]-'0'));
     }
        return li;
    }
    List<String> makeCombination(List<String> li,List<String> li1){
        List<String> li2=new ArrayList<>();
        if(li.size()==0){
            li2.addAll(li1);
            return li2;
        }else{
            for(String str1:li){
                for(String str2:li1){
                    li2.add(str1+str2);
                }
            }
        }
        return li2;
    }
}