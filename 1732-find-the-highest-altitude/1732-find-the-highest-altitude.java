class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int res=0;
        for(int i=0;i<gain.length;i++)
        {
            sum=sum+gain[i];

            res=Math.max(sum,res);
        }
        return res;
    }
}