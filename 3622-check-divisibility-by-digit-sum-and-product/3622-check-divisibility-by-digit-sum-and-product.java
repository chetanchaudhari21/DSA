class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int ori=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        return ori%(sum+product)==0;
        
    }
}