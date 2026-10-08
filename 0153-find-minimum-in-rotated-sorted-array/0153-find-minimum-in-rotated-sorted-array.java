class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int  high=nums.length-1;
        int mid;
        int ans=-1;
        
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]>nums[nums.length-1])
            {
               low=mid+1;
            }
            else
            {
            ans =nums[mid];
            high=mid-1;
            }
        }
        
        return ans;
    }
}