class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int []result=new int[]{-1,-1};
        while(r-l>=0){
            int mid=(l+r)/2;
            // System.out.println(r+" "+l);
            if(nums[mid]==target){
               if(mid-1>=0 && nums[mid-1]==target){
                   r=mid-1;
               }else{
                   result[0]=mid;
                   break;
               }
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
         // System.out.println(r+" "+l);
        l=0;r=nums.length-1;
        while(r-l>=0){
            int mid=(l+r)/2;
            // System.out.println(r+" "+l);
            if(nums[mid]==target){
               if(mid+1<nums.length && nums[mid+1]==target){
                   l=mid+1;
               }else{
                   result[1]=mid;
                    break;
               }
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}