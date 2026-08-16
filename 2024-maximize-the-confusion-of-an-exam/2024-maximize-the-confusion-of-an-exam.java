class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int freq[]=new int[256];

        int low=0;
        int high=0;
        int charmax=0;
        int res=0;
        int freqlen=0;
        int diff=0;
        
        while(high<answerKey.length())
        {
            freq[answerKey.charAt(high)-'A']++;
            charmax=Math.max(charmax,freq[answerKey.charAt(high)-'A']);
            diff=(high-low+1)-charmax;

            while(diff>k)
            {
                freq[answerKey.charAt(low)-'A']--;
                low++;
                diff=(high-low+1)-charmax;
            }

            res=Math.max(res,high-low+1);
            high++;


        }
        return res;
    }
}