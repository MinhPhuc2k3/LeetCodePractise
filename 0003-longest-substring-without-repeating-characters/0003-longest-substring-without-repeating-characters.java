class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int res = 0;
        int left = -1;
        for(int i=0; i<s.length(); i++){
            if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))>=left){
                left = m.get(s.charAt(i));
                m.remove(s.charAt(i));
            }
            m.put(s.charAt(i),i);
            res = Math.max(res, i-left);
        }
        return res;
    }
}