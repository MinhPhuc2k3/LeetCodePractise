class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int i=0; 
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){ 
                nums[k] = nums1[i];    
                i++;
            }
            else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            nums[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        double a = nums[nums.length/2];
        double b = nums[(nums.length-1)/2];
        return (a+b)/2;
    }
}