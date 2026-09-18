class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> stack= new Stack<>();

     int i=0;

     while(i<s.length())
     {
        if(stack.empty())
        {
            stack.push(s.charAt(i));
        }
        else if(stack.peek()==s.charAt(i))
        {
            stack.pop();
        }
        else{
            stack.push(s.charAt(i));
        }
        i++;
     }  

     StringBuilder sb = new StringBuilder();


     while(!stack.empty())
     {
        sb.append(stack.peek());
        stack.pop();
     }

     return sb.reverse().toString();
    }
}