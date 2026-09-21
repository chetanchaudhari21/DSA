class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(!stack.empty() && (Math.abs(stack.peek()-ch))==32)
            {
                stack.pop();
                continue;
            }
            stack.push(ch);
            
        }

        if(stack.empty())
        {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.empty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}