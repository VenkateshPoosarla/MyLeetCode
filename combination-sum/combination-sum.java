class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> li=new ArrayList<>();
         combinationSum(li,candidates,target,0,new ArrayList<Integer>());
        return li;
    }
    
    void combinationSum( List<List<Integer>> li,int[] candidates,int target,int idx,List<Integer> li2 ){
        if(target==0){
            li.add(new ArrayList<>(li2));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            li2.add(candidates[i]);
            if(target-candidates[i]>=0)
                combinationSum(li,candidates,target-candidates[i],i,li2);
            li2.remove(li2.size()-1);
        }
    }
    
}