class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();

        Arrays.sort(nums);
        int i;
        int left;
        int right;
        int sum;
        for(i=0;i<nums.length-2;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }

            sum=-1*nums[i];
             left=i+1;
            right=nums.length-1;

            while(left<right)
            {
                if((nums[left]+nums[right])==sum)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                   while(left < right && nums[left] == nums[left - 1])
                    {
                        left++;
                    }

                        while(left < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }

                }
                else if((nums[left]+nums[right])<sum)
                {
                 left++;

                }
                else
                {
                 right--;

                }
            }
        }
        return ans;
    }
}