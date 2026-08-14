class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        int high=0;
        int low=0;
        int max=0;
        while(high<s.length())
        {
            char ch=s.charAt(high);
            map.put(ch,
                    map.getOrDefault(ch, 0) + 1);
            
            while(map.get(ch)>2)
            {
                char remove=s.charAt(low);
                map.put(remove,map.get(remove)-1);

                if(map.get(remove)==0)
                {
                    map.remove(remove);
                }
                low++;
            }
            max=Math.max(max,high-low+1);

            high++;
        }
        return max;
    }
}