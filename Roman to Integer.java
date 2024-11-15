class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mp=new HashMap();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
          if(mp.get(a)<mp.get(b))
          {
            sum-=mp.get(a);
          }
          else
          {
            sum+=mp.get(a);
          }
        }
        return sum+mp.get(s.charAt(s.length()-1));
    }
}
