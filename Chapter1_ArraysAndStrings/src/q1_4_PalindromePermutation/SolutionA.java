package q1_4_PalindromePermutation;
/**
 * 
 * @author Zach
 *
 */
public class SolutionA {
	public static boolean isPalindromePermutation(String str){
		char[] chars = str.toCharArray();
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c: chars){
			int n = getCharNumber(c);
			System.out.println(n);
			if(n != -1){
			table[n]++;
			}
		}
		
		boolean foundOdd = false;
		for(int count: table){
			if(count % 2 == 1){
				if(foundOdd){
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	private static int getCharNumber(char ch) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		
		int val = Character.getNumericValue(ch);
		
		if(val>=a && val<=z){
			return val-a;
		}
		else if(val>=A && val<=Z){
			return val-A;
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "dsafdsa";
		System.out.println(isPalindromePermutation(str));
	}
}
