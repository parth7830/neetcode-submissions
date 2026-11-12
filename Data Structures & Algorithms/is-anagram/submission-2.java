class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0) + 1);
        }
        for(char d : t.toCharArray()){
            hm.put(d,hm.getOrDefault(d,0) - 1);
        }
        for(char c : hm.keySet()){
            if(hm.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
