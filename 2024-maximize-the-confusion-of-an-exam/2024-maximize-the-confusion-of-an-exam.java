class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int freq[] = new int[2];

        int low = 0;
        int high = 0;
        int charmax = 0;
        int res = 0;

        while(high < answerKey.length()) {

            int index = answerKey.charAt(high) == 'T' ? 0 : 1;

            freq[index]++;

            charmax = Math.max(charmax, freq[index]);

            int diff = (high - low + 1) - charmax;

            while(diff > k) {

                int remove = answerKey.charAt(low) == 'T' ? 0 : 1;

                freq[remove]--;

                low++;

                diff = (high - low + 1) - charmax;
            }

            res = Math.max(res, high - low + 1);

            high++;
        }

        return res;
    }
}