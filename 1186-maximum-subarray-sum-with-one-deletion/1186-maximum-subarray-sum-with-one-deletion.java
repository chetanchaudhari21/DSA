class Solution {
    public int maximumSum(int[] nums) {

        int nodelete = nums[0];
        int onedelete = Integer.MIN_VALUE;

        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int previousNo = nodelete;
            int previousOne = onedelete;

            nodelete = Math.max(
                nums[i],
                previousNo + nums[i]
            );

            onedelete = Math.max(
                previousNo,
                previousOne == Integer.MIN_VALUE
                    ? Integer.MIN_VALUE
                    : previousOne + nums[i]
            );

            ans = Math.max(ans, Math.max(nodelete, onedelete));
        }

        return ans;
    }
}