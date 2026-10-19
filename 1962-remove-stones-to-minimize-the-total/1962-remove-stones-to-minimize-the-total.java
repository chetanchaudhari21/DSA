class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++)
        {
            pq.add(piles[i]);
        }
    
        while(k>0)
        {
            int curr=pq.poll();
            curr=curr-curr/2;

            pq.add(curr);
            k--;
        }
        int ans=0;
        for(int i:pq)
        {
            ans=ans+i;
        }
        return ans;
    }
}