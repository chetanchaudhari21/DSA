class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int n = nums.length - 1;
        int high = n;
        int mid;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(nums[mid] == target)
                return mid;

            // mid is in left part
            if(nums[mid] > nums[n])
            {
                if(nums[mid] < target)
                {
                    low = mid + 1;
                }
                else
                {
                    if(nums[0] > target)
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
            }

            // mid is in right part
            else
            {
                if(nums[n] < target)
                {
                    high = mid - 1;
                }
                else
                {
                    if(nums[mid] > target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }

        return -1;
    }
}