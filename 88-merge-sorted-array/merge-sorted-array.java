class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        List<Integer> ls = new ArrayList<>();
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ls.add(nums1[i++]);
            }else{
                ls.add(nums2[j++]);
            }
        }
        // Add remaining elements of nums1
        while(i < m){
            ls.add(nums1[i++]);
        }

        // Add remaining elements of nums2
        while(j < n){
            ls.add(nums2[j++]);
        }

        // Copy back into nums1
        for(int k = 0; k < ls.size(); k++){
            nums1[k] = ls.get(k);
        }
    }
}