class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result=k;
        while(map.containsKey(result))
        {
            result+=k;
        }
        return result;
    }
}