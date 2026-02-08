class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> al = new ArrayList<>();
        int len = arr.length,flag = 0;

        for(int i=len;i>1;i--)
        {flag = 0;
            for(int j=0;j<i;j++)
            {
                if(arr[j] == i)
                {
                    flip(arr,j);
                    al.add(j+1);
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                flip(arr,i-1);
                al.add(i);
            }
            
        }return al;
    }

    public void flip(int[] ar,int targetidx)
    {
        int temp=0,l=0,r=targetidx;
        while(l<r){
            temp = ar[l];
            ar[l++] =ar[r];
            ar[r--] =temp;
        }
        
    }
}