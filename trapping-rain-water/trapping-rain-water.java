class Solution {
    public int trap(int[] height) {
        // amount of water trapped is 
        // trapped=min(maxleft[i],maxright[i])-height[i] 
        // if trpped >0 trapped else 0
        int lmax []=new int[height.length];
        int rmax []=new int[height.length];
        // int minlr []=new int[height.length];
        int left=0;
        for (int l=0;l<height.length;l++){
            left=Math.max(height[l],left);
            lmax[l]=left;
        }int right=0;
        for (int r=height.length-1;r>=0;r--){
            right=Math.max(height[r],right);
            rmax[r]=right;
        }
        int trapped=0;
        for(int i=0;i<height.length;i++){
            trapped +=Math.max(Math.min(lmax[i],rmax[i])-height[i],0);
        }
        return trapped;
    }
}