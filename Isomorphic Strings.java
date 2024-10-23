class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer>mp=new HashMap();
        HashMap<Character,Integer>mp1=new HashMap();
        for(int i=0;i<s.length();i++)
        {
            if(!mp.containsKey(t.charAt(i)))
            {
                mp.put(t.charAt(i),i);
            }
            if(!mp1.containsKey(s.charAt(i)))
            {
                mp1.put(s.charAt(i),i);
            }
            if(!mp1.get(s.charAt(i)).equals(mp.get(t.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}
