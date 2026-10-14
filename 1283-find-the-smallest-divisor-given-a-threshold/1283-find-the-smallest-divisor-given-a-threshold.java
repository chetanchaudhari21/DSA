class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high =nums[0];
        for(int i=1;i<nums.length;i++)
        {
            high = Math.max(high, nums[i]);
        }
        int mid;
        int ans=Integer.MIN_VALUE;
        while(low<=high)
        {
            mid=(low)+(high-low)/2;

            int sum=function(nums,threshold,mid);

            if(sum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
    return ans;
    }
    int function(int[] nums,int threshold, int mid)
    {
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum;
    }
}