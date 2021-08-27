class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        //maintain decreasing qu
        ArrayDeque<Integer> qu=new ArrayDeque<>();
        int arr[]=new int[nums.length-k+1];
        qu.offer(nums[0]);
        int idx=0;
        for(int i=1;i<nums.length;i++){
           if(i>=k){
               //adding new element
                arr[idx++]=nums[i-k]==qu.peekFirst()?qu.poll():qu.peekFirst();
           }
            //removing and new elemnet to dequeu
             removeAndAdd(qu,nums[i]);
        }
        arr[idx++]=qu.peekFirst();
        return arr; 
    }
    void removeAndAdd(ArrayDeque<Integer> qu,int x){
        while(!qu.isEmpty()  && qu.peekLast()<x){
                   qu.pollLast();
               }
               qu.offer(x); 
    }
}