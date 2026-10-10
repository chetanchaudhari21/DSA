class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int mid =0;
        int ans =-1;
        while(low<=high)
        {
            mid=(low+high)/2;

            if(matrix[mid][0]==target)
            {
                return true;
            }
            if(matrix[mid][0]>target)
            {
                high=mid-1;
            }
            else
            {
                ans=mid;
                low=mid+1;
            }


        }
        if(ans==-1)
        return false;
        low=0;
         high=matrix[ans].length-1;

        while(low<=high)
        {
            mid=(low+high)/2;

            if(matrix[ans][mid]==target)
            return true;

            if(matrix[ans][mid]>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return false;
    }
}