class Solution {

    int[] sortedSquares(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
            nums[i]*=nums[i];
        return mergeSort(nums);
    }
    int[] mergeSort(int[] nums) {
        if(nums.length <= 1)
        return nums;

        int length = nums.length,mid = length/2;
        int[] left = new int[mid],right = new int[length - mid];

        for(int i=0;i<mid;i++)
        left[i] = nums[i];

        for(int i = mid;i<length;i++)
        right[i - mid] = nums[i];

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right,left.length,right.length);
    }

    int[] merge(int[] left,int[] right,int l,int r)
    {
        int[] result = new int[l+r];
        int k=0,i=0,j=0;
        while(i<l && j<r)
        {
            if(left[i] <= right[j])
            result[k++]=left[i++];

            else
            result[k++]=right[j++];
        }

        if(j < r)
            while(j<r)result[k++] = right[j++];
        if(i < l)
            while(i<l)result[k++] = left[i++];
        return result;
    }
}