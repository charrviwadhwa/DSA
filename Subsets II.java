class Solution {
    public void helper(int ind,int[]arr,List<Integer>l1,List<List<Integer>>l){
       l.add(new ArrayList(l1));
       for(int i=ind;i<arr.length;i++){
        if(i!=ind && arr[i]==arr[i-1]){
            continue;
        }
        l1.add(arr[i]);
        helper(i+1,arr,l1,l);
        l1.remove(l1.size()-1);
       }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>l=new ArrayList();
        List<Integer>l1=new ArrayList();
        helper(0,nums,l1,l);
        return l;
    }
}