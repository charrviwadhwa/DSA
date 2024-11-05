class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] arr=s.split(" ");

        if(pattern.length()!=arr.length)
        {
            return false;
        }
        HashMap<Character,String>mp=new HashMap();
        for(int i=0;i<pattern.length();i++)
        {
            if(mp.containsKey(pattern.charAt(i)))
            {
                if(!mp.get(pattern.charAt(i)).equals(arr[i]))
                {
                    return false;
                }
                

            }
            else if(mp.containsValue(arr[i])){
                return false;
                }
            System.out.println(arr[i]);
            mp.put(pattern.charAt(i),arr[i]);
        }    
        return true;    
    }
}
