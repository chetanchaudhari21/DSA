class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1;
        int high=m*n;
        int res=0;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            int ans=function(m,n,mid);
            if(ans<k)
            low=mid+1;
            else
            {
                high=mid-1;
                res=mid;
            }
            
        }
        return res;

    }
    int function( int m, int n, int mid)
    {
        
        int count=0;
        for(int i=1;i<=m;i++)
        {
            count =count +Math.min(n,mid/i);
        }
        return count;
    } 
    
}