class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>(
           (a, b) -> {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        );

        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                count++;
                else
                break;
            }
            int[] curr={count,i};
            pq.add(curr);
        }
        int [] ans=new int[k];
        int i=0;
        while(k>0)
        {
            ans[i]=pq.poll()[1];
            i++;
            k--;
        }
        return ans;
    }
}