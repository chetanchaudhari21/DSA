class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[] > pq= new PriorityQueue<>(
            (a,b)->Integer.compare(a[0],b[0])
        );
       

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<Math.min(nums1.length,k);i++)
        {
            pq.add(new int[]{nums1[i]+nums2[0],i,0});
        }
        int j=0;
        int s=0;
        while(k>0)
        {
            int curr[] =pq.poll();

            int first=curr[1];
            int second=curr[2];

            list.add(new ArrayList<>());
            list.get(s).add(nums1[first]);
            list.get(s).add(nums2[second]);

            if(second+1<nums2.length)
            {
                pq.add(new int[]{nums1[first]+nums2[second+1],first,second+1});
            }
            s++;
            k--;
    }
    return list;
    }
}