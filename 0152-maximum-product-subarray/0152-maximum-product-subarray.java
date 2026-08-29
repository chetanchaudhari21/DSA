class Solution {
    public int maxProduct(int[] nums) {
        int maxending=nums[0];
        int minending=nums[0];
        int ans=nums[0];
        int v1;
        int v2;
        int v3;
        int bestending;
        for(int i=1;i<nums.length;i++)
        {
            v1=nums[i];
            v2=nums[i]*maxending;
            v3=nums[i]*minending;
            maxending=Math.max(Math.max(v3,v2),v1);
            minending=Math.min(Math.min(v3,v2),v1);
            ans=Math.max(Math.max(maxending,minending),ans);
        }
        return ans;
    }
}