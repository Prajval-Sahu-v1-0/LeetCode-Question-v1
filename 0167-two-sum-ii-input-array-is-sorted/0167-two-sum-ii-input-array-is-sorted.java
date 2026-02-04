class Solution {
    
    int BinarySearch(int[] ar, int target)
    {   
        int l=0,h=ar.length-1,mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(ar[mid] == target)return mid;
            else if(ar[mid] > target) h=mid-1;
            else if(ar[mid] < target) l=mid+1;
        }return -1;
    }
    
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++)
        {
            int complement  = target - numbers[i],r=BinarySearch(numbers,complement);
            if(i != r && r != -1)return new int[] {i+1,r+1};
            else if( i==r ) return new int[] {i+1,r+2};
        }return new int[] {-1,-1};
    }
}