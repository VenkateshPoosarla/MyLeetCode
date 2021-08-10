class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int x=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                x=x*nums[i];
            else
                count++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(count==1)
                    nums[i]=x;
                else
                   nums[i]=0;  
            }else{
                nums[i]=count>0?0:(x/nums[i]);
            }
        }
        return nums;
    }
}