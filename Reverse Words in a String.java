public class ReverseWords{
	public String reverseWords(String s) {
		if (s == null || s.isEmpty()) return "";
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1; i>=0; i--){
			if(!arr[i].equals("")){
				sb.append(arr[i]).append(" ");	
			}
		}
		return sb.length()==0? "" : sb.substring(0, sb.length()-1);
	}

    public static void main(String[] args){
        ReverseWords sol = new ReverseWords();
        String tc1 = "Hello World!";
        String res1 = sol.reverseWords(tc1);
 		System.out.println(res1);
    }
}
