class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] =new int[3];
        int low=0;
        int high=0;
        int count=0;
        while(high<s.length())
        {
            freq[s.charAt(high)-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0)
            {
                count=count+(s.length()-high);
                freq[s.charAt(low)-'a']--;
                low++;

            }
            high++;
        
        }
        return count;
        
    }
    
}