class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length())
       {
        return false;
       }
       return (s+s).contains(goal); // concating the string with itself contains all the possible rotations of string.
    }
}
