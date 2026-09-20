class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];

        for(int i=1;i<strs.length;i++)

        {
            String comman="";
            int j=0;
            while(j<s.length()&& j<strs[i].length() && s.charAt(j)==strs[i].charAt(j))
            {
                comman=comman+s.charAt(j);
                j++;
            }
            if(comman=="")
            {
                return "";
            }

            s=comman;
        }

        return s;
    }
}