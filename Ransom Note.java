class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mp=new HashMap();
       
        for(int i=0;i<magazine.length();i++)
        {
            char a=magazine.charAt(i);
            if(!mp.containsKey(a))
            {
                mp.put(a,1);

            }
            else
            {
                mp.put(a,mp.get(a)+1);
            }

        }

        for(int i=0;i<ransomNote.length();i++)
        {
            char a= ransomNote.charAt(i);
            if(mp.containsKey(a) && mp.get(a)>0)
            {
                mp.put(a,mp.get(a)-1);

            }
            else
            {
               return false;
            }

        }
        return true;
    }
}
