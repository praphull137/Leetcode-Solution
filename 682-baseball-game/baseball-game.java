class Solution {
    public int calPoints(String[] s) {
         Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length; i++) {
            String ch = s[i];

            if(ch.equals("C")) {
                st.pop();
            }
            else if(ch.equals("D")) {
                int dbl = st.peek() * 2;
                st.push(dbl);
            }
            else if(ch.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else {
                st.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}