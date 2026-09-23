class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count=0;
        int start1=intervals[0][0];
        int end1=intervals[0][1];

        int start2;
        int end2;

        for(int i=1;i<intervals.length;i++)
        {
            end2=intervals[i][1];

            if( end2<=end1)
            {
                count=count+1;
                continue;
            }
            end1=end2;
        }
        return intervals.length-count;
    }
}