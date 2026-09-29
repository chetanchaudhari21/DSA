class Solution {
    public String finalString(String s) {
        char current;
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<s.length();k++)
        {
            current=s.charAt(k);

            if(current=='i')
            {
           sb.reverse();     
            }
            else
            sb.append(current);
        }
        return sb.toString();
    }
}