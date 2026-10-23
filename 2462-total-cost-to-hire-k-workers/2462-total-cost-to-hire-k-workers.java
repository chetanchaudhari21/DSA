class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1= new PriorityQueue<>();
        PriorityQueue<Integer> pq2= new PriorityQueue<>();

        int i=0;
        int j=costs.length-1;
        while(i<candidates && i<=j  )
        {
            pq1.add(costs[i]);
            i++;
        }
        int m=0;
        while(m<candidates && j>=i)
        {
            pq2.add(costs[j]);
            j--;
            m++;
        }
        long total=0;
        while(k>0)
        {
            if(pq2.isEmpty() || (!pq1.isEmpty() && (pq1.peek()<=pq2.peek())))
            {
            
                total=total+pq1.poll();
                if(i<=j)
                {
                pq1.add(costs[i]);
                i++;
                }
            
            }
            else
            {
                total=total+pq2.poll();
                if(i<=j)
                {
                    
                     pq2.add(costs[j]);
                     j--;
                     
                }

            }
            k--;
            }

            
             return total;
        }
       


}