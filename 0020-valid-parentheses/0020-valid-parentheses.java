class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        Map<Character, Character> cm  = new HashMap<>();
        cm.put(')','(');
        cm.put('}','{');
        cm.put(']','[');
        for(int i=0; i<s.length(); i++){
            if(!st.isEmpty()&&cm.containsKey(s.charAt(i))&& st.peek().equals(cm.get(s.charAt(i)))){
                st.pop();
            }
           else st.push(s.charAt(i));
        }
        return (st.isEmpty());
    }
}