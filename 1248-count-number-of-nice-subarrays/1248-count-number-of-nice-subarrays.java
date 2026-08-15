class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
            return fun(nums,k)-fun(nums,k-1);
    }

        public int fun(int[] nums,int k)
        {
        int low=0;
        int high=0;
        int odd=0;
        int count=0;


        while(high<nums.length)
        {
            if(nums[high]%2!=0)
            {
                odd++;
            }

            while(odd>k)
            {
                if(nums[low]%2!=0)
                {
                    odd--;
                }
                low++;
            }
            count=count+(high-low+1);
            high++;
        }
        return count;
    }
}