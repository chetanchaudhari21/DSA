class Solution {
    public int minimumRecolors(String blocks, int k) {
        int low=0;
        int high=0;
        int min = Integer.MAX_VALUE;
        int count=0;
        while(high<blocks.length())
        {
            if(blocks.charAt(high)=='W')
            {
                count++;
            }

            while((high-low+1)>k)
            {
                if(blocks.charAt(low)=='W')
                {
                    count--;
                }
                low++;
            }
            if((high-low+1)==k)
            {
            min=Math.min(min,count);
            }
            high++;
        }
        return min;
    }
}