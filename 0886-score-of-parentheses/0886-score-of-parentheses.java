class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        Stack<Integer> st = new Stack();

        for(char each: s.toCharArray()){
            int val = 0;
            if(each == '('){
                st.push(0);
            }

            else{
                while(st.peek() != 0){
                    val += st.pop();
                }
                val = Math.max(2*val,1);
                st.pop();
                st.push(val);
            }
        }

        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}