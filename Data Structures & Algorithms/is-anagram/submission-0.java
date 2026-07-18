class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
        return false;
        }
        char[]s1=new char[s.length()];
        char[]s2=new char[t.length()];
        for(int i=0;i<s1.length;i++)
        {
            s1[i]=s.charAt(i);
            s2[i]=t.charAt(i);
        }
            Arrays.sort(s1);
            Arrays.sort(s2);
            String v=Arrays.toString(s1);
            String r=Arrays.toString(s2);
            for(int i=0;i<v.length();i++)
            {
                if(v.charAt(i)!=r.charAt(i))
                return false;
            }
        return true;
    }
}
