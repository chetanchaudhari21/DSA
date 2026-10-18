class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] arr=new int[capital.length][2];

        for(int i=0;i<capital.length;i++)
        {
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(k>0)
        {
            
            while(i < arr.length && arr[i][0]<=w)
            {
                pq.add(arr[i][1]);
                i++;
            }
            if(pq.isEmpty())
            {
                return w;
            }
            w=w+pq.poll();
            k--;

        }
        return w;
    }
}