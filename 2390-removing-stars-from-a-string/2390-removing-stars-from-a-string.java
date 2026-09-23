class Solution {
    public String removeStars(String s) {
        //Stack<Character> stack=new Stack<>();
        char ch;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(sb.length()!=0 && ch=='*')
            {
                sb.deleteCharAt(sb.length()-1);
                continue;
            }
            sb.append(ch);

        }
        
        // while(!stack.empty())
        // {
        //     sb.append(stack.pop());
        // }
        return sb.toString();
    }
}