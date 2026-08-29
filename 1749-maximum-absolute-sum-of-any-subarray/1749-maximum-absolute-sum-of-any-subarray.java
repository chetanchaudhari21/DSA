class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestmax=nums[0];
        int bestmin=nums[0];
        int maxans=nums[0];
        int minans=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int v1=nums[i];
            int v2=nums[i]+bestmax;
            int v3=nums[i]+bestmin;
            bestmax=Math.max(v1,v2);
            maxans=Math.max(maxans,bestmax);
            bestmin=Math.min(v1,v3);
            minans=Math.min(minans,bestmin);

        }

        if(Math.abs(minans)>Math.abs(maxans))
        {
            return Math.abs(minans);
        }
        return Math.abs(maxans);

    }
}