class Solution {
    public int longestSubarray(int[] nums) {
        int low=0;
        int high=0;
        int maxlength=0;
        int zero=0;
        while(high<nums.length)
        {
            if(nums[high]==0)
            {
                zero++;
            }
            while(zero>1)
            {
                if(nums[low]==0)
                {
                    zero--;
                }
                low++;
            }

            maxlength=Math.max(maxlength,high-low+1);
            high++;
        }
        
        return maxlength-1;
    }
}