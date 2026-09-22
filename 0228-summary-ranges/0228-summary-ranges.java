class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> arr = new ArrayList<>();
        if(nums.length==0)
        return arr;
       int start=nums[0];
      

       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]-nums[i-1]!=1)
        {
            if(start!=nums[i-1])
            {
            arr.add(start+"->"+nums[i-1]);
            start=nums[i];
            }
            else
            {
                arr.add(""+start);
                start=nums[i];
            }
        }
        
       } 
       if(start!=nums[nums.length-1])
       arr.add(start+"->"+nums[nums.length-1]);

       else
        arr.add(""+start);
       return arr;


    }
}