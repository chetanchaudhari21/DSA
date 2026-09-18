class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack  = new Stack<>(); 
       int i=0;
        if(s.length()%2!=0)
        {
            return false;
        }
        
       for(i=0;i<s.length();i++)
       {
        
        char current=s.charAt(i);
        if(stack.empty())
        {
            stack.push(s.charAt(i));
            
        }
        
        else if((stack.peek()=='{' && current=='}') || (stack.peek()=='[' && current== ']') || (stack.peek()=='(' && current==')'))
        {
            stack.pop();
        }
        else
        {
            stack.push(s.charAt(i));
        }
        

       }
       if(stack.empty())
       {
        return true;
       }
       return false;
    }
}