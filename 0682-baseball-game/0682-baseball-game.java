class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int one ;
        int sum;
        char ch;
        for(int i=0;i<operations.length;i++)
        {
            
            
            if(!stack.empty() && operations[i].equals("C"))
            {
                stack.pop();
                continue;
            }

            if(!stack.empty() && operations[i].equals("D"))
            {
                stack.push(stack.peek()*2);
                continue;
            }
            if(!stack.empty() && operations[i].equals("+"))
            {
                one=stack.pop();
                
                sum=one+stack.peek();
                stack.push(one);
                stack.push(sum);
                continue;
            }

            stack.push(Integer.parseInt(operations[i]));
        }
        int i=0;
        int res=0;
        while(!stack.empty())
        {
            res=res+stack.pop();
        }
        return res;
    }
}