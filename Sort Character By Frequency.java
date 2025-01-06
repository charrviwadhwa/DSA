class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>mp=new HashMap();
        ArrayList<Character>l=new ArrayList();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);

        }
        for(char val:mp.keySet()){
            l.add(val);
        }
        Collections.sort(l,(a, b) ->mp.get(b)-mp.get(a)); 
        for(int i=0;i<l.size();i++){
            char ch=l.get(i);
            ans+=String.valueOf(ch).repeat(mp.get(ch));
        }
        return ans;
        
    }
}
