class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq=new int[26];

      int low=0;
      int high=0;
      int max=0;
      int maxfreq=0;
      int freqlen=0;
      while(high<s.length())
      {
            int index=s.charAt(high)-'A';
            freq[index]++;
            maxfreq=Math.max(maxfreq,freq[index]);
            freqlen=high-low+1;
            while((freqlen-maxfreq)>k)
            {
                freq[s.charAt(low)-'A']--;
                low++;
                maxfreq=Math.max(maxfreq,freq[index]);
                freqlen=high-low+1;
            }
            max=Math.max(max,high-low+1);
            high++;
      }
      return max;
    }
}