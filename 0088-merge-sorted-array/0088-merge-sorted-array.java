class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int n2=0;
        // for(int i=m;i<m+n;i++)
        // nums1[i]=nums2[n2++];

        // Arrays.sort(nums1);

        if(m == 0)
        {
            for(int i=0;i<n;i++)
            nums1[i]=nums2[i];

            return;
        }

        if(n == 0)
        return;

        int i=m-1,j=n-1,x=m+n-1;

        while(i >= 0 && j >= 0)
        {
            if(nums1[i] >= nums2[j])
            {
                nums1[x--]=nums1[i];
                i--;
            }

            else if(nums1[i] <= nums2[j])
            {
                nums1[x--]=nums2[j];
                j--;
            }

        }
   
        if(i >= 0)
        {
            while(i >= 0)
            nums1[x--]=nums1[i--];
        }
   
        if(j >= 0)
        {
            while(j >= 0)
            nums1[x--]=nums2[j--];
        }
    }
}