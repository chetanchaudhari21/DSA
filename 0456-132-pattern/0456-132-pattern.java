class Solution {
    public boolean find132pattern(int[] nums) {
        int second=Integer.MIN_VALUE;

        Stack<Integer> stack=new Stack<>();

        for(int i=nums.length-1;i>=0;i--)
        {

            if(second>nums[i])
            {
                return true;
            }
            while(!stack.empty() && nums[i]>stack.peek())
            {
                second=stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}