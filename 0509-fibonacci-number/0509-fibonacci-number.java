class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int i=2;
        int sum=0;
        if(n<2)
        {
            return  n;
        }
        while(i<=n)
        {
            sum=a+b;

            a=b;
            b=sum;
            i++;
        }
        return sum;
    }
}