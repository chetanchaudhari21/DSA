class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < fruits.length; right++) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            while(map.size() > 2) {

                int remove = fruits[left];

                map.put(remove, map.get(remove) - 1);

                if(map.get(remove) == 0) {
                    map.remove(remove);
                }

                left++;
            }

            // Current valid window
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}