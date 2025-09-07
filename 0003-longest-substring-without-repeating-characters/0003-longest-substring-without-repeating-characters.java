class Solution {
    public int lengthOfLongestSubstring(String s) {
        int beginOfSubstring = 0;
        Map<Character, Integer> lastPositionOfChar = new HashMap<>();
        int result = 0;
        for(int i=0; i<s.length(); i++){
            if(lastPositionOfChar.containsKey(s.charAt(i))&&lastPositionOfChar.get(s.charAt(i)) >= beginOfSubstring){
                beginOfSubstring = lastPositionOfChar.get(s.charAt(i))+1;
            }
            result = Math.max(result, i-beginOfSubstring+1);
            lastPositionOfChar.put(s.charAt(i), i);
        }
        return result;
    }
}