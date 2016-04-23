package q1_4_PalindromePermutation;

public class SolutionB {
	public static boolean isPalindromePermutation(String str){
		int oddCount = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : str.toCharArray()){
			int n = getCharNumber(c);
			if(n != -1){
				table[n]++;
				if(table[n] % 2 == 1){
					oddCount++;
				}
				else{
					oddCount--;
				}
			}
		}
		return oddCount<=1;
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
		System.out.println(isPalindromePermutation("ab $ba"));
	}
}
