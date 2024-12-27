class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }

        }
      Set<Integer> s = new HashSet<>();
        for (int val : mp.values()) {
            s.add(val);
        }

        return mp.size() == s.size();
    }
}
