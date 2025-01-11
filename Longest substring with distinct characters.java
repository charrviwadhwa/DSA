class Solution {
    public int longestUniqueSubstr(String s) {
        
        // code here
        int index=0;
        int max=0;
       HashSet<Character>l=new HashSet();
        for(int i=0;i<s.length();i++){
            while (l.contains(s.charAt(i))){
                l.remove(s.charAt(index));
                index++;
            }
            l.add(s.charAt(i));
            max=Math.max(max,i-index+1);
        }
        return max;
    }
}
