class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!stack1.empty() && s.charAt(i)=='#')
            {
                stack1.pop();
                continue;
            }
            if( s.charAt(i)!='#')
            stack1.push(s.charAt(i));
        }
         for(int i=0;i<t.length();i++)
        {
            if(!stack2.empty() && t.charAt(i)=='#')
            {
                stack2.pop();
                continue;
            }
            if( t.charAt(i)!='#')
            stack2.push(t.charAt(i));
        }

        while(!stack1.empty() && !stack2.empty())
        {
            if(stack1.pop()!=stack2.pop())
            {
                return false;
            }
        }

        if(stack1.empty() && stack2.empty())
        return true;

        return false;
    }
}