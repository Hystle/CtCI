package q1_6_StringCompression;

public class SolutionA {
	public static String doStringCompression(String str){
		StringBuffer sb = new StringBuffer();
		int count = 0; 
		for(int i=0; i<str.length();i++){
			count++;
			/*
			 *  i+1>=str.length() must be the first condition to be judged
			 *  otherwise->index out of bound
			 */
			if(i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
				sb.append(str.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		return sb.length() > str.length() ? str: sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(doStringCompression("aabccccccaaa"));
	}
}
