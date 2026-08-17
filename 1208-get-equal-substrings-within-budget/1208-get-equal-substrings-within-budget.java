class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int low=0;
        int high=0;
        int max=0;
        int cost=0;
        while(high<s.length())
        {
            cost=cost+Math.abs(s.charAt(high)-t.charAt(high));
            while(cost>maxCost)
            {
                cost=cost-Math.abs(s.charAt(low)-t.charAt(low));
                low++;
            }
            max=Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}