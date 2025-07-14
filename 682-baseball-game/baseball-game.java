class Solution {
    public int calPoints(String[] operations) {
        int res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int last=Integer.valueOf(st.peek());
                int re=2*last;
                st.push(re);
            }
            else if(operations[i].equals("+")){
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);
                st.push(top1 + top2); 
            }
            else{
                st.push(Integer.valueOf(operations[i]));
            }
        }
            while(!st.isEmpty()){
                res+=st.pop();
            }
            return res;
    }
}