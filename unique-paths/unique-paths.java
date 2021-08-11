class Solution {
    public int uniquePaths(int m, int n) {
        int x[][]=new int[m][n];
        Arrays.fill(x[0],1);
        for(int i=0;i<m;i++)
            x[i][0]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                x[i][j]=x[i-1][j]+x[i][j-1];
            }}
        return x[m-1][n-1];
    }
}