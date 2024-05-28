class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                if(st.size()>1){
                    st.pop();
                    if(!st.empty()){
                        max = Math.max(max, i-st.peek());
                    }
                }
                else {
                    st.pop();
                    st.push(i);
                }
            }
        }
        return max;
    }
}