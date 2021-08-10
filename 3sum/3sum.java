class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    set.add(List.of(nums[i],nums[l],nums[r]));
                }
                if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}