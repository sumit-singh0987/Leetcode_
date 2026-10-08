class Solution {
    public int scoreOfParentheses(String s) {
        int count = 0;
        int depth = 0;
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(ch[i]);
                depth++;
            }else{
                if(!st.isEmpty() && st.peek()=='('){
                    if (ch[i - 1] == '(') {
                        count += (int)Math.pow(2, depth - 1);
                    }
                    st.pop();
                    depth--;
                }
            }
        }
        return count;
    }
}