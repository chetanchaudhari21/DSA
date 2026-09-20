class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int reverse;
        for(int i=0;i<s.length();i++)
        {
            reverse=26-(s.charAt(i)-'a');
            sum=sum+(reverse*(i+1));
        }
        return sum;
    }
}