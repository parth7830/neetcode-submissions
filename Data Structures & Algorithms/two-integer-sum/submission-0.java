class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int need = target - nums[i];
            if(seen.containsKey(need)) return new int[]{seen.get(need),i};
            seen.put(nums[i],i);
        }
        return new int[]{0};
    }
}
