class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int[] ans= new int[nums.length];
        int i=0;
        while(!pq.isEmpty())
        {
            int first=pq.poll();
            int second=pq.poll();
            ans[i]=second;
            i++;
            ans[i]=first;
            i++;
        }
        return ans;
    }
}