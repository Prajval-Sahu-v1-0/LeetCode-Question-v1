class Solution {

    public boolean isHappy(int n) {
        int fast = n,slow = n;

        while(fast != 1)
        {
            fast = digitSum(digitSum(fast)); 
            slow = digitSum(slow);

            if(fast == slow &&  slow != 1)
            return false;
        }return true;
    }
    public int digitSum(int num)
    {
        int sum=0,d=0;;
        while(num != 0)
        {
            d=num%10;
            sum+=d*d;
            num/=10;
        }
        System.out.println("\nDigit Sum function:\n"+sum);
        return sum;
    }
}