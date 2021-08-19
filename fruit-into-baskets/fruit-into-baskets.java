class Solution {
    public int totalFruit(int[] fruits) {
        int maxCount=0;
        int count=0;
        int last=0;
        int []lo=new int[2];
        Set<Integer> set=new HashSet<>();
        while(last<fruits.length){
           set.add(fruits[last]);
            if(set.size()==3){
             maxCount=Math.max(count,maxCount);
             count=last-lo[1];
             set=new HashSet<>(List.of(fruits[last],lo[0]));   
            }
            if(lo[0]!=fruits[last]){
               lo[0]=fruits[last];
               lo[1]=last;
           }
            last++;
            count++;
        }
         maxCount=Math.max(count,maxCount);
        return maxCount;
    }
   
}