class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = temperatures.length - 1; i >= 0; i--)
        {
            int count = 0;

            while(!stack.empty() &&
                  temperatures[stack.peek()] <= temperatures[i])
            {
                stack.pop();
            }

            if(stack.empty())
            {
                res[i] = 0;
            }
            else
            {
                res[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return res;
    }
}