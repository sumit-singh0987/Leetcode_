class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] a = new int[size];
        for(int i=0;i<nums1.length;i++){
            a[i] = nums1[i];
        }
        for(int j= 0;j<nums2.length;j++){
            a[nums1.length+j]=nums2[j];
        }
        Arrays.sort(a);
        if(size%2!=0){
            return a[size / 2];
        }else{
            return (a[(size / 2) - 1] + a[size / 2]) / 2.0;
        }
    }
}