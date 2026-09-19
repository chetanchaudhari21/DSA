class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];

        Stack<Integer> stack=new Stack<>();

        ans[ans.length-1]=prices[prices.length-1];


        stack.push(ans[ans.length-1]);

        for(int i=prices.length-2;i>=0;i--)
        {
            while(!stack.empty() && stack.peek()>prices[i])
            {
                stack.pop();
            }

            if(!stack.empty())
            {
                ans[i]=prices[i]-stack.peek();
            }
            else
            {
                ans[i]=prices[i];
            }
            stack.push(prices[i]);
        }
        return ans;

       
    }
}