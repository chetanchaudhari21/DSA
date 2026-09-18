class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] k=new int[nums.length];

        int j;
        for(int i=0;i<nums.length;i++)
        {
            j=i+1;
             if(j==nums.length)
                {
                    j=0;
                }
            while(j!=i)
            {
                if(nums[j]>nums[i])
                {
                    k[i]=nums[j];
                    break;
                }
                j++;
                if(j==nums.length)
                {
                    j=0;
                }
            }
            if(j==i)
            {
                    k[i]=-1;
            }
        }
        return k;
    }
}