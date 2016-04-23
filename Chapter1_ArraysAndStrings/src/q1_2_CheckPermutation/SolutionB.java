package q1_2_CheckPermutation;

/**
 * 
 * @author Zach
 *
 */
public class SolutionB {
	
	public static boolean checkPermutation(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		// set a string as reference: count used letters in a int array 
		int[] letters = new int[128];
		char[] chars = s.toCharArray();
		for(char c: chars){
			letters[c]++;
		}
		
		// compare each letter of string t with int array of string s
		for(int i=0; i<t.length(); i++){
			int val = t.charAt(i);
			letters[val]--;
			// 0->match; negetive->new letter appears in string t
			if (letters[val] < 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPermutation("apple", "aleep"));
	}
}
