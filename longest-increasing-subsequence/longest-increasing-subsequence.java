class Solution {
    public int lengthOfLIS(int[] nums) {
        int is[]=new int[nums.length];
        Arrays.fill(is,1);
        int seq=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>=0;j--){
                if(nums[j]<nums[i])
                {
                    is[i]=Math.max(is[j]+1,is[i]);
                    seq=Math.max(is[i],seq);
                }
            }
        }
        return seq;
    }
}