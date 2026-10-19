class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        boolean flag=true;
        int count=0;
        int start=0;
       
        for(int  i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(flag)
                {
                    start=i;
                    flag =false;
                }
                count++;
            }
            if(nums[i]>target)
            break;
        }
        List<Integer> ans=new ArrayList<>();
        int j=1;
        while(j<=count)
        {
            ans.add(start);
            start++;
            j++;
        }
        return ans;
}
}