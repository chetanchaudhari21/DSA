class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];

        int ans=0;
        int mid;

        while(low<=high)
        {
            mid=(low+high)/2;

            if(function(position,m,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    boolean function(int[] position,int m,int mid)
    {
        int count=1;
        int prev=position[0];
        for(int i=1;i<position.length;i++)
        {
            if((position[i]-prev)>=mid)
            {
                count++;
                prev=position[i];
            }
        }
        if(count>=m)
        return true;

        return false;
    }
}