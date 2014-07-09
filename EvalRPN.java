import java.util.*;

public class EvalRPN{
    public int evalRPN(String[] tokens) {
        if(tokens.length==0) return 0;
        Stack<Integer> st = new Stack<Integer>();
        int res = 0;
        for(int i=0;i<tokens.length;i++){
            String tmp = tokens[i];
            if(tmp.matches("[+-]*\\d+")){
                st.push(Integer.parseInt(tmp));
            }else{
                int b = st.pop();
                int a = st.pop();
                if(tmp.equals("+")){
                    res = a + b;
                }else if (tmp.equals("-")) {
                    res = a - b;
                }else if (tmp.equals("*")) {
                    res = a * b;
                }else if(tmp.equals("/")){
                    res = a / b;
                }else{
                    return 0;
                }
                st.push(res);
            }
        }
        res = st.pop();
        return res;
    }

    public static void main(String[] args){
        String[] tc1 = {"0", "3", "/"};
        String[] tc2 = {"-3", "3", "/"};
        EvalRPN sol = new EvalRPN();
        int res1 = sol.evalRPN(tc1);
        System.out.println(res1);
        int res2 = sol.evalRPN(tc2);
        System.out.println(res2);
    }
}



