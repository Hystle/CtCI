package q1_1_IsUnique;

/**
 * Assume ASCII string rather not Unicode 
 * with maximum 128 characters in alphabet
 * T:O(n) S:O(1)
 * @author Zach
 *
 */
public class SolutionA {
	public static boolean isUnique(String str){
		// if larger than 128 characters return false
		if (str.length()>128){
			return false;
		}
		// 128 is able to contain all english words
		boolean[] charSet = new boolean[128];
		for (int i=0; i<str.length(); i++){
			// get the char value of each word 
			int c = str.charAt(i);
			// if the element in the array is used -> not unique
			if (charSet[c]){
				return false;
			}
			// set the element at charVal of the boolean array as used
			charSet[c] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] strArray = {"apple","banana","pear","orange"};
		for(String s: strArray){
			System.out.println(s + ":" + isUnique(s));
		}
	}
}
