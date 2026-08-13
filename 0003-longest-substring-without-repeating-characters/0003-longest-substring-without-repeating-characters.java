class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int right=0;

        int max=0;
        while(right<s.length())
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch)>1)
            {
                char remove=s.charAt(left);
                map.put(remove, map.get(remove) - 1);

                if(map.get(remove)==0)
                {
                    map.remove(remove);
                }
                left++;
                
            }
        
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}