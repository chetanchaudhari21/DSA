class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums.length];
        int j=nums.length-2;
        while(j!=-1)
        {
            stack.push(nums[j]);
            j--;
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stack.empty() && stack.peek()<=nums[i])
            {
                stack.pop();
            }
            if(stack.empty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=stack.peek();
            }

            stack.push(nums[i]);
        }
        return res;
    }
}