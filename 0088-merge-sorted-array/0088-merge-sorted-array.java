class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n2=0;
        for(int i=m;i<m+n;i++)
        nums1[i]=nums2[n2++];

        Arrays.sort(nums1);

    }
}