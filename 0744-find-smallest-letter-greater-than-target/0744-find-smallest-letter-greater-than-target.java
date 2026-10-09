class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        int mid;
        char ans=letters[0];
        while(low<=high)
        {
            mid=(low+high)/2;

            if(letters[mid]<=target)
            low=mid+1;
            else
            {
            ans=letters[mid];
            high=mid-1;
            }


        }
        return ans;
    }
}