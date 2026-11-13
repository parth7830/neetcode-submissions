class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String st : strs){
            sb.append(st.length()).append('#').append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> al = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            al.add(str.substring(j+1,j+1+len));
            i = j + 1 + len;
        }
        return al;
    }
}
