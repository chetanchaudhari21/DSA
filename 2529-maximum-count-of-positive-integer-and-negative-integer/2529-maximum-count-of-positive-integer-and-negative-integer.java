class Solution {
    public int maximumCount(int[] nums) {
        int neg=0;

        int i=0;

        while(i<nums.length && nums[i]<=0)
        {
            if(nums[i]<0)
            neg++;

            i++;
        }

        return Math.max(neg,(nums.length-i));

    }
}