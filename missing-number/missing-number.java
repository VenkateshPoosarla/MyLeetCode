class Solution {
    public int missingNumber(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int n=nums.length;
        return Math.abs(sum-((n)*(n+1))/2);
    }
}