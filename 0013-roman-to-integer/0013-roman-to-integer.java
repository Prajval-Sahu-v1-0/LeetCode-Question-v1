class Solution {
    public int romanToInt(String s) {
        String roman = "IVXLCDM";int[] value = {1,5,10,50,100,500,1000};
        int d=0,curr=0,next=0;
        for(int i=0; i < s.length()-1; i++)
        {
            char ch = s.charAt(i);
            curr = roman.indexOf(ch); next = roman.indexOf(s.charAt(i+1));
            
            if(curr < next)
            d -= value[curr];

            else 
            d +=value[curr];            
        }
        return d+=value[roman.indexOf(s.charAt(s.length()-1))];
    }
}