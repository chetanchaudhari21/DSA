class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> stack= new Stack<>();

     int i=0;

     StringBuilder sb =new StringBuilder();


     while(i<s.length())
     {
        if(sb.length()==0)
        {
            sb.append(s.charAt(i));
        }
        else if(sb.charAt(sb.length()-1)==s.charAt(i))
        {
            sb.deleteCharAt(sb.length()-1);
        }
        else
        {
            sb.append(s.charAt(i));
        }
        i++;
     }
     return sb.toString();
    }
}