class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> m = new HashSet<>();
        int i=0, j=1;
        if(s.length()==0) return 0;
        m.add(s.charAt(i));
        int res = 1;
        while(j<s.length()&&i<=j){
            if(m.contains(s.charAt(j))){
                m.remove(s.charAt(i));
                i++;
            }else{
                m.add(s.charAt(j));
                res = Math.max(res, m.size());
                j++;
            }
        }
        return res;
    }
}