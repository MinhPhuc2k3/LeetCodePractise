class Solution {
    public int mySqrt(int x) {
        int l = 0; 
        int r = x;
        int sqrt = 0;
        int mid;
        while(l<=r){
            mid = l - (l-r)/2;
            if(mid==0 || (mid!=0 && mid<=x/mid)){
                sqrt=mid;
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return (int) sqrt;
    }
}