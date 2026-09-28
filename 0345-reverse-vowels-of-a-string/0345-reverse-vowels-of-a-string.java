class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char k;
        char m;
        char[] ch=new char[s.length()];
        for(int n=0;n<s.length();n++)
        {
            ch[n]=s.charAt(n);
        }
        while(i<s.length() && j>=0 && i<=j)
        {
            k=ch[i];
            m=ch[j];
            if(k=='a' ||  k=='e' || k=='i' || k=='o' || k=='u' || k=='A' ||  k=='E' || k=='I' || k=='O' || k=='U' )
            {
                 if(m=='a' ||  m=='e' || m=='i' || m=='o' || m=='u' || m=='A' ||  m=='E' || m=='I' || m=='O' || m=='U' )
                 {
                    char temp=k;
                    ch[i]=ch[j];
                    ch[j]=k;
                    i++;
                    j--;
                 }
            }
            if(!(k=='a' ||  k=='e' || k=='i' || k=='o' || k=='u' || k=='A' ||  k=='E' || k=='I' || k=='O' || k=='U'))
            i++;

             if(!(m=='a' ||  m=='e' || m=='i' || m=='o' || m=='u'  || m=='A' ||  m=='E' || m=='I' || m=='O' || m=='U'))
             j--;


        }
        s = new String(ch);
        return s;

    }
}