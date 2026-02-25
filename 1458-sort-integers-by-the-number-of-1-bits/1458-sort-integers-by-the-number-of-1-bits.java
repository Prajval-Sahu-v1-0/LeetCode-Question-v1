class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        ArrayList<int[]> list = new ArrayList<>();
        for(int ele: arr)
        {
            int setbits = Integer.bitCount(ele);
            list.add(new int[]{ele,setbits});
        }

        Collections.sort(list, (a,b) -> a[1] != b[1] ? a[1] - b[1] :a[0] - b[0]);
        int res[] = new int[n];
        for(int i = 0; i < list.size(); i++)
        res[i] = list.get(i)[0];

        return res;
    }
}