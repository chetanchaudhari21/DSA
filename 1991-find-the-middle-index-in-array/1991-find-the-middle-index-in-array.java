class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int score=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }

        int right;
        for(int i=0;i<nums.length;i++)
        {


            if(i==0)
            {
                right=sum-nums[i]-score;

            if(score ==right)
            {
                return i;
            }
            continue;
            }
            score=score+nums[i-1];
            right=sum-nums[i]-score;

            if(score ==right)
            {
                return i;
            }
            
        }
        return -1;
    }
}