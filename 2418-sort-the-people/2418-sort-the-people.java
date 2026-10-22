class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Object[]> pq=new PriorityQueue<>(
            (a,b)->Integer.compare((int)b[0],(int)a[0])
        );

        for(int i=0;i<heights.length;i++)
        {
            pq.add(new Object[]{heights[i],names[i]});
        }
        String[] ans =new String[names.length];
        int i=0;
        while(!pq.isEmpty())
        {
            ans[i]=(String) pq.poll()[1];
           i++;
        }
        return ans;
    }
}