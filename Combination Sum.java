class Solution {
    public void helper(int i,int[]arr,List<Integer>l,List<List<Integer>>ans,int t){
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList(l));
            }
            return;  
        }
        if(arr[i]<=t){
             l.add(arr[i]);
             helper(i,arr,l,ans,t-arr[i]);
             l.remove(l.size()-1);
        }
       
        helper(i+1,arr,l,ans,t);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList();
        List<Integer>l=new ArrayList();
        helper(0,candidates,l,ans,target);
        return ans;

    }
}
