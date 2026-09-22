class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int diff;
        int total=duration;

        for(int i=1;i<timeSeries.length;i++)
        {
            diff=timeSeries[i]-timeSeries[i-1];

            if(diff>=duration)
            {
                total=total+duration;
            }
            else
            {
                total=total+(diff);
            }
        }
        
        return total;
    }
}