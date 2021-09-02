class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        min.add(num);
        max.add(min.poll());
        if(max.size()-min.size()>1){
            min.add(max.poll());
        }
    }
    
    public double findMedian() {
        if(min.size()==max.size()){
            return (min.peek()+max.peek())*1.0/2.0;
        }else{
            return max.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */