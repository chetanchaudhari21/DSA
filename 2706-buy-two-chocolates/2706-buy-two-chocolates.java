class Solution {
    public int buyChoco(int[] nums, int money) {
        int smaller=nums[0];
        int second=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(smaller>nums[i])
            {
                second=smaller;
                smaller=nums[i];
            }
            else if(second>nums[i])
            {
                second=nums[i];
            }
        }

        if((smaller+second)<=money)
        {
            return money-(smaller+second);
        }
        return money;
    }
}