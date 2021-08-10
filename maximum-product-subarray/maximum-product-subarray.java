class Solution {
    public int maxProduct(int[] nums) {
        int maxsofar=nums[0];
        int minsofar=nums[0];
        int result=maxsofar;
        for(int i=1;i<nums.length;i++){
            int tempmax=Math.max(nums[i],Math.max(nums[i]*maxsofar,nums[i]*minsofar));
            
            minsofar=Math.min(nums[i],Math.min(nums[i]*maxsofar,nums[i]*minsofar));
            maxsofar=tempmax;
            result=Math.max(maxsofar,result);
        }
        return result;
    }
}