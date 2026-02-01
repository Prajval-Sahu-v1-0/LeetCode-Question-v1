class Solution {
    public int removeDuplicates(int[] nums) {
        // int k=0;
        // HashSet<Integer> h= new HashSet<>();

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(!h.contains(nums[i]))
        //     {
        //         h.add(nums[i]);
        //         nums[k++]=nums[i];
        //     }
        // }
        // return  k;

        int kk=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[kk]=nums[i];
                kk++;
            }
        }return kk++;
    }
}