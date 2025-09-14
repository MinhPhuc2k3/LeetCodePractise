class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res = 0;
        while(l<r){
            res = Math.max(Math.min(height[r], height[l])*(r-l), res);
            if(height[l]>height[r]){
                r--;
            }else l++;
        }
        return res;
    }
}