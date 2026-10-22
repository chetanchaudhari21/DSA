class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq= new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
        );
        double original,added,diff;
        for(int i=0;i<classes.length;i++)
        {
            original=(double)classes[i][0]/classes[i][1];
            added=(double)(classes[i][0]+1)/(classes[i][1]+1);
            diff=(added-original);
           
            pq.add(new double[]{diff,classes[i][0],classes[i][1]});
        }
        
            while(extraStudents>0)
            {
                double[] curr=pq.poll();
                original=(double)((curr[1]+1)/(curr[2]+1));
                added=(double)(curr[1]+2)/(curr[2]+2);
                diff=added-original;
                pq.add(new double[]{diff,curr[1]+1,curr[2]+1});
                extraStudents--;
            } 
           double sum=0;
          while(!pq.isEmpty())
          {
            double[] curr=pq.poll();
            sum=((double)curr[1]/curr[2]) +sum;
         }

         return (double)sum/classes.length;

      }
}