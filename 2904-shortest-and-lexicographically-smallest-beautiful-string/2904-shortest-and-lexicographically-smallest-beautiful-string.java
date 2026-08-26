class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int low=0;
        int len;
        int result=s.length();
        int count=0;
        int start=0;
        boolean flag=false;
        for(int high=0;high<s.length();high++)
        {
            if(s.charAt(high)=='1')
            {
                count++;
            }
            while(count==k)
            {
                flag=true;
                len=high-low+1;
                if(result>len)
                {
                    start=low;
                    result=len;
                }
                if(result==len)
                {
                    String previous=s.substring(start,start+result);
                    String current=s.substring(low,high+1);

                    if(current.compareTo(previous)<0)
                    {
                        start=low;
                    }

                }
                if(s.charAt(low)=='1')
                {
                    count--;
                }
                low++;
            }
        }
        if(flag)
        {
            return s.substring(start,start+result);
        }
        return "";


    }
}