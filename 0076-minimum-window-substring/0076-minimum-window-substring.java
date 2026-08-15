class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[52];
        int freq2[]=new int[52];
        for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        if(ch >= 'a' && ch <= 'z') {
            freq[ch - 'a']++;
        }
        else if(ch >= 'A' && ch <= 'Z') {
            freq[ch - 'A' + 26]++;
      }
        }
        int low=0;
        int high=0;
        int res=Integer.MAX_VALUE;
        int start=0;
        while(high<s.length())
        {
             char second=s.charAt(high);
             if(second>='a' && second<='z')
                freq2[second-'a']++;
             else if(second>='A' && second<='Z')
             {
                freq2[second-'A'+26]++;
             }

             while(fun(freq2,freq))
             {
                int len=high-low+1;
                if(res>len)
                {
                    res=len;
                    start=low;
                }
                char remove = s.charAt(low);

                if(remove >= 'a' && remove <= 'z') {
                    freq2[remove - 'a']--;
                }
                else if(remove >= 'A' && remove <= 'Z') {
                    freq2[remove - 'A' + 26]--;
                }

                low++;
                
             }
             high++;
        }
        if(res == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start,start+res);
    }
    boolean fun(int[] f2,int[] f1)
    {
        int i;
        for(i=0;i<52;i++)
        {
            if(f2[i]<f1[i])
            {
                return false;
            }
        }
        return true;
    }
}