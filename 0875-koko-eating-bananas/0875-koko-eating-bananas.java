class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high= piles[0]; for(int x : piles) high = Math.max(high, x);;
        long sum;
        int ans=-1;
        int speed;
        while(low <= high)
        {
            speed=(low+high)/2;
            sum=0;
            for(int i=0;i<piles.length;i++)
            {
                sum=sum+(piles[i]/speed);
                if(piles[i]%speed!=0)
                sum++;
            }
            if(sum>h)
            low=speed+1;
            else
            {
                ans=speed;
                high=speed-1;
            }

        }
        return ans;
    }
}