class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            
            int rem = sum - goal;
            if(mp.containsKey(rem)) {
                count += mp.get(rem);
            }

            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
