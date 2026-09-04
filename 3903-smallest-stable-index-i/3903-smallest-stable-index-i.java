class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int res=-1;
        
        for(int i=0;i<nums.length;i++)
        {
            int min=nums[i];
            int max=nums[i];

            int start=0;
            for(int j=start;j<=i;j++)
            {
                max=Math.max(max,nums[j]);
            }
            for(int m=i;m<nums.length;m++)
            {
                min=Math.min(min,nums[m]);
            }
            int sum=max-min;
            int last=0;
            if(sum<=k)
            {
                if(res==-1){
                    res=i;
                    last=sum;
                }else if( last>sum)
                {
                    res=i;
                    last=sum;
                }
            }

        }
        return res;
    }
}