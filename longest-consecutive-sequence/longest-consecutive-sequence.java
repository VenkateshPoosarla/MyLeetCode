class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
       for(int x:nums) set.add(x);
        int longest=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int temp=nums[i];
                int streak=1;
                while(set.contains(temp+1)){
                    temp++;
                    streak++;
                }
                longest=Math.max(longest,streak);
            }    
        }
        return longest;
    }
}