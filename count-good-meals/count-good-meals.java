class Solution {
    public int countPairs(int[] deliciousness) {
        int x[]=new int[22];
        calculate(x);
        int total=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<deliciousness.length;i++){
            int count=0;
             for(int j=0;j<22;j++){
                count+=map.getOrDefault(x[j]-deliciousness[i],0);
             }
            map.put(deliciousness[i],map.getOrDefault(deliciousness[i],0)+1);
            // System.out.println(total);
            total+=count;
            total=total%1_000_000_007;
        }
       
        return total;
    }
        void calculate(int []x){
            x[0]=1;
            for(int i=1;i<x.length;i++){
                x[i]=2*x[i-1];
            }
            // System.out.println(Arrays.toString(x));
        }
    
}