class Solution {
    public int smallestIndex(int[] nums) {
        int rem;
        int sum;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            while(nums[i]!=0)
            {
                rem=nums[i]%10;
                sum=sum+rem;
                nums[i]=nums[i]/10;
            }
            if(sum==i)
            {
                return i;
            }
        }
        return -1;
    }
}