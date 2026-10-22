class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map =new HashMap<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>(
            (a,b)->Integer.compare(b[1],a[1])
        );
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(char cha:map.keySet())
       {
        pq.add(new int[]{cha,map.get(cha)});
       }
       StringBuilder sb = new StringBuilder();
       while(!pq.isEmpty())
       {
        int[] cha=pq.poll();

        while(cha[1]>0)
        {
            sb.append((char)cha[0]);
            cha[1]--;
        }
       }
       return sb.toString();
    }
}