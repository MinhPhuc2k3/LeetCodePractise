class Solution {
    public int mySqrt(int x) {
        long l = 0; 
        long r = x;
        long sqrt = -1L;
        while(l<=r){
            long mid = l - (l-r)/2;
            if(mid*mid<=x){
                sqrt=mid;
                l = mid+1;
            }else if(mid*mid>x){
                r=mid-1;
            }
        }
        return (int) sqrt;
    }
}