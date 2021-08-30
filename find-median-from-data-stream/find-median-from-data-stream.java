class MedianFinder {

    /** initialize your data structure here. */
   PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min=new  PriorityQueue<Integer>();
        max=new  PriorityQueue<Integer>((a,b)->b-a);
    }
    
    public void addNum(int num) {
            max.offer(num);
            min.offer(max.poll());
           if(max.size()<min.size()){
               max.offer(min.poll());
           } 
    }
    
    public double findMedian() {
            if(max.size()>min.size()){
                return max.peek();
            }else{
                return (0.5)*(max.peek()+min.peek());
            }        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */