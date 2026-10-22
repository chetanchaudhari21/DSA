class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }

        while(k>0)
        {
            int  curr=pq.poll();
            pq.add(curr+1);
            k--;
        }

        long product=1;

        while(!pq.isEmpty())
        {
            product=product*pq.poll() % 1000000007;
        }

        return (int)product;




    }
}