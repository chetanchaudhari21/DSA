class Solution {
    public int maxSubArray(int[] nums) {
        int bestending=nums[0];
        int ans=nums[0];
        int v1;
        int v2;

        for(int i=1;i<nums.length;i++)
        {
            v1=nums[i];
            v2=nums[i]+bestending;
            bestending=Math.max(v1,v2);
            ans=Math.max(ans,bestending);

        }
        return ans;
    }
}