class Solution {
    public int rob(int[] nums) {
       return simpleRobber(nums,0,nums.length);
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