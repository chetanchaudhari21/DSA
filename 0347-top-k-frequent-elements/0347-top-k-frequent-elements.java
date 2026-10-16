class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)-> a[0] - b[0]
        );
        
        for(int element: map.keySet())
        {
            int freq=map.get(element);
            int[] curr={freq,element};
            if(pq.size()<k)
            {
            pq.offer(curr);
            continue;
            }

            if(curr[0]>pq.peek()[0])
            {
                pq.poll();
                pq.offer(curr);
            }


        }
        int[] ans=new int[k];

        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll()[1];
        }
        return ans;

    }
}