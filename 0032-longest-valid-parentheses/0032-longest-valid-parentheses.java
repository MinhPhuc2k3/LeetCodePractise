class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            if((st.peek()!=-1 && s.charAt(i)==')' && s.charAt(st.peek())=='(')){
                st.pop(); 
                res = Math.max(res, i-st.peek());
            }else st.push(i);
        }
        return res;
    }
}