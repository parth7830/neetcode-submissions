class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            hs.add(num);
        }
        int cnt = 0;
        int best = 0;
        for(int num : hs){
            if(hs.contains(num-1)){
                continue;
            }
            int cur = num;
            int length = 1;
            while(hs.contains(cur+1)){
                cur++;
                length++;
            }
            best = Math.max(best,length);
        }
        return best;
    }
}
