class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> li1=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates,0,target,li,li1);
         // List<List<Integer>> li3=new ArrayList<>(li);
        return li;
    }
    void combinationSum2(int[] candidates,int idx, int target, List<List<Integer>> li,List<Integer> li1){
        if(target==0){
            li.add(new ArrayList<>(li1));
            return;
        }
        else if(target<0||idx==candidates.length){
            return;
        }else{
            for(int i=idx;i<candidates.length;i++){
             if(i>idx && candidates[i]==candidates[i-1]) continue;   
             li1.add(candidates[i]);
             combinationSum2(candidates,i+1,target-candidates[i],li,li1);
             li1.remove(li1.size()-1);
            }
            
             
        }
    }
}