class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int maxi = 0;
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0) + 1);
        }
        List<Integer> values = new ArrayList<>(hm.keySet());
        values.sort((a,b) -> Integer.compare(hm.get(b),hm.get(a)));

        int[] res = new int[k];
        for(int i = 0;i < k;i++){
            res[i] = values.get(i);
        }
        return res;
    }
}