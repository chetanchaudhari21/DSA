class Solution {
    public boolean isValid(String s) {
      char[] ch=new char[s.length()];

      int top=-1;
        char current;
        char open;

      for(int i=0;i<s.length();i++)
      {
        current=s.charAt(i);

        if(current=='(' || current=='[' || current=='{')
        {
            top++;
            ch[top]=current;
        }
        else{
            if(top==-1)
            {
                return false;
            }

            open=ch[top];
            if((open == '(' && current == ')') ||
                   (open == '[' && current == ']') ||
                   (open == '{' && current == '}'))
                   {
                    top--;
                   }
            else 
            return false;
        }
      }
      return top==-1;
    }
}