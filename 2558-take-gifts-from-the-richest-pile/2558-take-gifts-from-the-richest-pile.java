class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<gifts.length;i++)
        {
            pq.add(gifts[i]);
        }

        while(k>0)
        {
            int curr=pq.poll();
            pq.add((int)(Math.sqrt(curr)));
            k--;
        }
        long ans=0;
        for(int i:pq)
        {
            ans=ans+i;
        }
        return ans;
    }
}