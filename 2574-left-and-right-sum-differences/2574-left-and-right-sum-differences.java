class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        sum=sum-nums[0];
        ans[0]=Math.abs(0-sum);
        int leftsum=0;
        for(int i=1;i<nums.length;i++)
        {
            leftsum=leftsum+nums[i-1];
            sum=sum-nums[i];

            ans[i]=Math.abs(leftsum-sum);
        }
        return ans;
    }
}