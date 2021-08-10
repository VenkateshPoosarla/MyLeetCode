class Solution {
    public int maxArea(int[] nums) {
        int area=0;
        int maxArea=0;
        int l=0,r=nums.length-1;
        while(l<r){
            area=Math.min(nums[l],nums[r])*(r-l);
            maxArea=Math.max(maxArea,area);
            if(nums[l]>nums[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxArea;
    }
}