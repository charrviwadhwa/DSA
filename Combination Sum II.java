class Solution {
    public void helper(int i,int[]arr,List<Integer>l,List<List<Integer>>ans,int t){
            if(t==0){
                ans.add(new ArrayList(l));
                 return; 
            }
        
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]){
                continue;
            }
            if(arr[j]<=t){
            l.add(arr[j]);
            helper(j+1,arr,l,ans,t-arr[j]);
            l.remove(l.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList();
        List<Integer>l=new ArrayList();
        Arrays.sort(candidates);
        helper(0,candidates,l,ans,target);
        return ans;
    }
}
