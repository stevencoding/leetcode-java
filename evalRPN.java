import java.util.*;

public class evalRPN{
    public int evalRPN(String[] tokens) {
    	Stack<Integer> st = new Stack<Integer>();
    	int res = 0;
        for(int i=tokens.length-1;i>=0;i--){
        	String tmp = tokens[i];
    		if(tmp.matches("\\d+")){
    			st.push(Integer.parseInt(tmp));
    		}else{
    			int b = st.pop();
    			int a = st.pop();
    			switch(tmp){
    				case "+": res = a + b;
    				case "-": res = a - b;
    				case "*": res = a * b;
    				case "/": res = a / b;
    			}
    			st.push(res);
    		}
        }
    	return res;
    }

	public static void main(String[] args){
		String[] tc1 = {"0", "3", "/"};
		int res = self.evalRPN(tc1);
		System.out.println(res);
	}
}

