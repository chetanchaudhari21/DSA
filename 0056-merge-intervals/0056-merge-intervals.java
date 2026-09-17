class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        int start1=intervals[0][0];
        int end1=intervals[0][1];

        int start2;
        int end2;
        int j=0;
        for(int i=1;i<intervals.length;i++)
        {
            start2=intervals[i][0];
            end2=intervals[i][1];

            if(end1>=start2)
            {
                end1=Math.max(end1,end2);
                continue;
            }
            else
            {
               ArrayList<Integer> temp=new ArrayList<>();
               temp.add(start1);
               temp.add(end1);
               list.add(temp);
                start1=start2;
                end1=end2;
            }



        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(start1);
        temp.add(end1);
        list.add(temp);
        int[][] result=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            result[i][0]=list.get(i).get(0);
            result[i][1]=list.get(i).get(1);
        }
        return result;
}
}