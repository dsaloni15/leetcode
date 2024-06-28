class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int res[] = new int[nums1.length + nums2.length];
        int i = 0,j=0,k=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
            }else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            res[k] = nums2[j];
            j++;
            k++;
        }
        
        int len = res.length;
        int start = 0;
        int end = res.length - 1;
        int mid = (start + end)/2;
        if(len%2 != 0){
            return res[mid];
        }
        return (float)(res[mid] + res[mid+1])/2;
    }
}