class Solution {
public:
    int divide(long long dividend, long long divisor) {
        long long sign = 1;
        if(dividend<0){
            sign = -sign;
            dividend = -dividend;
        }
        if(divisor<0){
            sign = -sign;
            divisor = -divisor;
        }
        if(sign < 0) return (int) max((long long) INT_MIN,-divideGreaterThanZero(dividend, divisor));
        return (int) min((long long) INT_MAX, divideGreaterThanZero(dividend, divisor));
    }

    long long divideGreaterThanZero(long long dividend, long long divisor){
        long long cnt = 0;
        long long tmp = divisor;
        long long x = 1;
        while(true){
            if(dividend>=tmp){
                tmp=tmp<<1;
                x=x<<1;
            }else{
                tmp=tmp>>1;
                x=x>>1;       
                dividend-=tmp;
                cnt+=x;
                tmp = divisor;
                if(divisor > dividend ) {
                    break;
                }
                x=1;
            }
        }
        return cnt;
    }

};