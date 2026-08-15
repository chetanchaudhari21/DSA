class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] s1freq=new int[26];
       int[] s2freq=new int[26];

       for(int i=0;i<s1.length();i++)
       {
        s1freq[s1.charAt(i)-'a']++;
       }

       int low=0;
       int high=0;

       while(high<s2.length())
       {
            s2freq[s2.charAt(high)-'a']++;

            while((high-low+1)>s1.length())
            {
                s2freq[s2.charAt(low)-'a']--;
                low++;
            }
            if(fun(s1freq,s2freq))
            {
                return true;
            }
            
            high++;
       }
       return false;

    }
    boolean fun(int[] f1,int[] f2)
    {
        for(int i=0;i<26;i++)
        {
            if(f2[i]!=f1[i])
            {
                return false;
            }
        }
       
        return true;
    }
}