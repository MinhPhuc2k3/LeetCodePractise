class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(reverse(x)==x) return true;
        return false;
    }

    public int reverse(int x){
        int reverseNum = 0;
        while(x>0){
            reverseNum = reverseNum*10 + x%10;
            x/=10;
        }
        return reverseNum;
    }
}