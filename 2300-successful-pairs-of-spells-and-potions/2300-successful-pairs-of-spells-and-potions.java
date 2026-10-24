class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans=new int[spells.length];
        int  j=0;
        for(int i=0;i<spells.length;i++)
        {
         ans[j]=search(potions,spells[i],success);
         j++;
        }
        return ans;
    }

    int search(int[] potions,int k,long success)
    {
        int low=0;
        int high=potions.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;

            if((long)potions[mid]*k>=success)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return potions.length-low;
    }


}