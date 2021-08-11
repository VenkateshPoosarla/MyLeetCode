class Solution {
    public int rob(int[] nums) {
        if (nums.length<2) return nums[0];
        int r1=simpleRobber(nums,1,nums.length);
        int r2=simpleRobber(nums,0,nums.length-1);
        return Math.max(r1,r2);
    }
    public int simpleRobber(int[] nums,int start,int end){
        int h1=0,h2=0;
        int sum=0;
        for(int i=start;i<end;i++){
            int temp=Math.max(h1+nums[i],h2);
            h1=h2;
            h2=temp;
        }
        return Math.max(h2,h1);
    }
}