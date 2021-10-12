class Solution {
    Map<Integer,Integer> map=new HashMap<>();
    public int getKth(int lo, int hi, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->
                                                      (
                                                          Integer.compare(map.get(a),map.get(b))==0?
                                                          Integer.compare(a,b):
                                                          Integer.compare(map.get(a),map.get(b))
                                                                          ));
        for(int i=lo;i<=hi;i++){
            // System.out.println(i+"\t"+stepS(i));
            map.put(i,stepS(i));
           pq.offer(i);
        }
        int out=-1;
        for(int i=0;i<k;i++)
            out=pq.poll();
        return out;
    }
    int stepS(int x){
        // System.out.println(x);
        if(map.containsKey(x)) return map.get(x);
        if(x==1) 
            return 0;
        if(x%2==0){
            map.put(x,1+stepS(x/2));
           return map.get(x);
        } 
        else{
             map.put(x,1+stepS(3*x+1));
             return map.get(x);
        }
        
    }
}