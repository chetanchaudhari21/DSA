class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0];
        int high=0;
        int ans=0;
        int mid=0;

        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>low)
            {
                low=weights[i];
            }
            high=high+weights[i];
        }
        while(low<=high)
        {
            mid=(low+high)/2;

            if(function(weights,days,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;

    }
    boolean function(int[] weights,int days, int mid)
    {
        int count=0;
        int d=1;
        for(int i=0;i<weights.length;i++)
        {
            if((count+weights[i])<=mid)
            {
                count=count+weights[i];
            }
            else
            {
                d++;
                count=weights[i];
            }
        }
        if(d<=days)
        {
            return true;
        }
        return false;
    }
}