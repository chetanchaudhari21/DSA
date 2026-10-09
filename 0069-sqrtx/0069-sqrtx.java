class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        long mid;
        long ans=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if((mid*mid)==x)
            return (int)mid;
            if((mid*mid)<x)
            {
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return (int) ans;
    }
}