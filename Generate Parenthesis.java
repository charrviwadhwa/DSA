class Solution {
    public void helper(int i,int j,int n,String str,List<String>l1){
        //i=open bracket  j=close bracket
        if(i==n && j==n){
            l1.add(str);
            return;
        }
       if(i<n){
        helper(i+1,j,n,str+"(",l1);
       }
        if(j<i){
            helper(i,j+1,n,str+")",l1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String>l1=new ArrayList();
        String str="";
        helper(0,0,n,str,l1);
        return l1;
}
}