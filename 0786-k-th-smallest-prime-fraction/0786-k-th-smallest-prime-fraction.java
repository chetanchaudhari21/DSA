class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(a[0], b[0])
        );
    int j=arr.length-1;
    for(int i=0;i<arr.length-1;i++)
    {
        pq.add(new double[]{(double)arr[i]/arr[j],i,j});
    }
    int[] ans=new int[2];

    while(k>1)
    {
        double[] curr=pq.poll();
        int i=(int)curr[1];
        int m=(int)curr[2];

        if(m-1>=0)
                 pq.add(new double[]{(double)arr[i]/arr[m-1],i,m-1});
       
       k--;
    }
double[] curr = pq.poll();
       int i=(int)curr[1];
        int m=(int)curr[2];
    return new int[]{arr[i],arr[m]};
    }
}