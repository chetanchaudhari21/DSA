class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int bestending=nums[0];
        int minending=nums[0];
        int v1;
        int v2;
        int ans=nums[0];
        int ans2=nums[0];
        int sum=nums[0];
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=1;i<nums.length;i++)
        {
            sum=sum+nums[i];
            v1=nums[i];
            v2=nums[i]+bestending;
            bestending=Math.max(v1,v2);
            minending=Math.min(v1,(nums[i]+minending));
            ans2=Math.min(minending,ans2);

            ans=Math.max(ans,bestending);
        }
        if(ans<0)
        {
            return ans;
        }
        return Math.max(ans,(sum-ans2));
    }
}