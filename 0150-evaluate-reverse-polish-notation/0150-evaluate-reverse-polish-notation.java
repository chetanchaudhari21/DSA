class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
         int one;
         int two;
        for(int i=0;i<tokens.length;i++)
        {
            
            if( tokens[i].equals("+")) 
            {
                one=stack.pop();
                two=stack.pop();
                stack.push(one+two);
                continue;
            }
            if( tokens[i].equals("*") )
            {
                one=stack.pop();
                two=stack.pop();
                stack.push(one*two);
                continue;
            }
            if(tokens[i].equals("/") )
            {
                one=stack.pop();
                two=stack.pop();
                stack.push(two/one);
                continue;
            }
            if( tokens[i].equals("-") )
            {
                one=stack.pop();
                two=stack.pop();
                stack.push(two-one);
                continue;
            }
            
            stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.peek();
    }
}