class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=Integer.MAX_VALUE;
        int left;
        int right;
        int sum;
        int temp;
        int finall=0;
        for(int high=0;high<nums.length-2;high++)
        {
            left=high+1;
            right=nums.length-1;

            while(left<right)
            {
            sum=nums[high]+nums[left]+nums[right];
            temp=Math.abs(sum-target);
            if(temp<result)
            {
                finall=sum;
                result=temp;
            }
            if(sum < target) {
                    left++;
                }
             else if(sum > target) {
                    right--;
                }
            else
            {
                return target;
            }
            


            

        }
        }
        return finall;
    }
}