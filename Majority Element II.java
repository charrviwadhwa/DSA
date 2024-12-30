class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList();
        HashMap<Integer,Integer>mp=new HashMap();
        for(int val:nums){
            mp.put(val,mp.getOrDefault(val,0)+1);
        }
        for(int key:mp.keySet()){
            System.out.println(mp.get(key));
            if(mp.get(key)>Math.floor(n/3)){
                l.add(key);
            }
        }
        return l;
    }
}
