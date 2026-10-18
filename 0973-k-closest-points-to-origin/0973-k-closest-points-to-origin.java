class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>( (a, b) -> Integer.compare(a[0], b[0]));
        
        int distance;
        for(int i=0;i<points.length;i++)
        {   
            distance=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            int[] curr={distance,i};
            pq.add(curr);

        }
        int[][] ans=new int[k][2];
        int i=0;
        while(k>0)
        {
            int j=pq.poll()[1];
            ans[i][0]=points[j][0];
            ans[i][1]=points[j][1];
            k--;
            i++;
        }
        return ans;
    }
}