class Solution {
    public String finalString(String s) {
        char current;
        StringBuilder sb=new StringBuilder();
        int i;
        int j;
        for(int k=0;k<s.length();k++)
        {
            current=s.charAt(k);

            if(current=='i')
            {
                i=0;
                j=sb.length()-1;
                while(i<j)
                {
                   char temp = sb.charAt(i);

sb.setCharAt(i, sb.charAt(j));
sb.setCharAt(j, temp);
i++;
j--;
continue;
            
                }
            }
            else
            sb.append(current);
        }
        return sb.toString();
    }
}