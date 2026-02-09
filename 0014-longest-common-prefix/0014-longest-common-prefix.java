class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)return strs[0];
        int store=10000000,k=0;
        for(int i=0;i<strs.length-1;i++)
        {
            k=0;
            int len = Math.min(strs[i].length(),strs[i+1].length());
            while(k < len){
                if(strs[i].charAt(k) != strs[i+1].charAt(k))
                break;
                k++;
            }if( store >= k)store = k;
        }if(store == 10000000 )store = 0;
        return strs[0].substring(0,store);
    }
}