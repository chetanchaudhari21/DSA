class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low=matrix[0][0];
        int high=matrix[matrix.length-1][matrix[0].length-1];
        int res=0;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            int ans=function(matrix,mid);
            if(ans<k)
            low=mid+1;
            else
            {
                high=mid-1;
                res=mid;
            }
            
        }
        return res;

    }
    int function( int[][] matrix, int mid)
    {
        int row=matrix.length-1;
        int col=0;
        int count=0;
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]<=mid)
            {
                count=count+row+1;
                col++;
            }
            else
            {
                row--; 
            }

        }
        return count;
    } 
}