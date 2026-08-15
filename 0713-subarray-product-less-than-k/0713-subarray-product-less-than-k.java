class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    

        int left = 0;
        int sum = 1;
        int count = 0;

        if(k<=0){
            return 0;
        }


        for(int right = 0; right < nums.length; right++) {

            sum *= nums[right];

            while(sum >=k && left<nums.length ) {
                sum /= nums[left];
                left++;
            }

            count += right - left + 1;
        }


        return count;
        }

    }
