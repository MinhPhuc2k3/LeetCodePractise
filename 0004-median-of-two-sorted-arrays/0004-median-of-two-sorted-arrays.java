class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2, nums1);
        int sz = nums1.length+nums2.length;
        int l = 0, r = nums1.length;
        while(l<=r){
            int x = (l+r)/2;
            int y = sz/2-x;
            int al = (x>0)? nums1[x-1]:Integer.MIN_VALUE;
            int ar = (x<nums1.length)? nums1[x]:Integer.MAX_VALUE;
            int bl = (y>0)? nums2[y-1]:Integer.MIN_VALUE;
            int br = (y<nums2.length)? nums2[y]:Integer.MAX_VALUE;
            if(al<=br&&bl<=ar){
                return (sz%2==0)? (double)(Math.max(al,bl)+Math.min(ar,br))/2:(double)Math.min(ar, br);
            }
            else if(al>br){
                r = x-1;
            }else l = x+1;
        }
        return l;
    }
}