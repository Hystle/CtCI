package q1_2_CheckPermutation;
/**
 * DualPivotQuickSort
 * T: O(n log(n))
 * @author Zach
 *
 */
public class SolutionA {
	// sort string in alphabet order
	private static String sort(String str){
		char[] chars = str.toCharArray();
		java.util.Arrays.sort(chars);
		System.out.println(chars);
		return new String(chars);
	}
	
	public static boolean checkPermutation(String s, String t){
		if (s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		System.out.println(checkPermutation("apple", "alepp"));
	}
}
