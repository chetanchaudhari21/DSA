class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int pfreq[] =new int[26];
        int sfreq[] =new int[26];
        for(int i=0;i<p.length();i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }
        int low=0;
        int high=0;

        while(high<s.length())
        {
            sfreq[s.charAt(high)-'a']++;
            
            while(high-low+1>p.length())
            {
                sfreq[s.charAt(low)-'a']--;
                low++;
            }

            if(fun2(sfreq,pfreq))
            {
                ans.add(low);
            }
            high++;


        }
        return ans;
    }
   
    boolean fun2(int[] f1,int[] f2)
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