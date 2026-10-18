class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq= new PriorityQueue<>(
            (a,b)->
            {
            if(a.length()!=b.length())
            {
                return Integer.compare(a.length(),b.length());

            }
            
            return a.compareTo(b);
            }
        );
        
       
        for(int i=0;i<k;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++)
        {
           if(pq.peek().length() < nums[i].length() ||
                (pq.peek().length() == nums[i].length()
                && pq.peek().compareTo(nums[i]) < 0))
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        
       
        return ""+pq.poll();
    }
}