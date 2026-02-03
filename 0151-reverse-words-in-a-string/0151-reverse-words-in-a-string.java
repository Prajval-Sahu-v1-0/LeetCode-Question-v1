class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+"," ");
        String ar[]=s.split(" ");
        StringBuilder str= new StringBuilder();
        for(int i=ar.length - 1;i >= 0 ; i--)
        {
            str.append(ar[i]);
            if(i != 0 )str.append(" ");
        }

        return str.toString();       
    }
}