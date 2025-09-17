class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int res = nums[l];
        while(l<=r){
            int mid = l - (l-r)/2;
            if(nums[mid]<=nums[r]){
                res = nums[mid];
                r--;
            }else{
                l++;
            }
        }
        return res;
    }
}