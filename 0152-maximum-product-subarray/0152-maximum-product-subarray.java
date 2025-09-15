class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int neg = 0;
        int pos = 0;
        int res = nums[0];
        for(int i=0; i<n; i++){
            int old_pos = pos;
            int old_neg = neg;
            if(nums[i]>0){
                neg*=nums[i];
                pos*=nums[i];
                if(pos==0) pos=nums[i];
            }else if(nums[i]<0){
                neg=old_pos*nums[i];
                pos=old_neg*nums[i];
                if(neg==0) neg=nums[i];
            }else{
                neg=0;
                pos=0;
            }
            res=Math.max(res, pos);
            //System.out.println(pos+" "+neg);
        }
        return res;
    }
}