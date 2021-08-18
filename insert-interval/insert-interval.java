class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
        List<int[]> li = new ArrayList<>();
        boolean merged = false;
        for (int[] x : intervals) {
          // intervals before we see intersection
            if (x[1] < ni[0]) {
                li.add(x);
            } // intervals after we see intersection
            else if (x[0] > ni[1]) {
                if (!merged) {  //check if the interval is not merged and add it to the list
                    li.add(ni);
                    merged = true;
                }
                li.add(x);
            } else {  // intervals with intersection
                ni[0] = Math.min(ni[0], x[0]);
                ni[1] = Math.max(ni[1], x[1]);
            }
        }
        if (!merged) {  //check if the interval is not merged and add it to the list
            li.add(ni);
        }
        int y[][] = new int[li.size()][2];
        for (int i = 0; i < li.size(); i++) {
            y[i] = li.get(i);
        }
        return y;
    }
}