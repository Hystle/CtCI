package q5_1_Insertion;

public class Solution {
	 public static int updateBits(int n, int m, int i, int j){
		 int allOnes = ~0;			   // 11111111111111111111111111111111
		 int left = allOnes << (j+1);  // 11111111111111111110000000000000
		 int right = (1 << i) - 1;	   // 00000000000000000000000000001111
		 int mask = left | right;
		 
		 int n_cleared = n & mask;
		 int m_shifted = m << i;	   // 00000000000000000000000011010000
		 
		 return n_cleared | m_shifted;
	 }
	public static void main(String[] args) {
		 int a = 103217; // 00000000000000011001001100110001
			int b = 13;  // 00000000000000000000000000001101
			int c = updateBits(a, b, 4, 12);
			System.out.println(toFullBinaryString(c));
	}
	 public static String toFullBinaryString(int a) {
			String s = "";
			for (int i = 0; i < 32; i++) {
				Integer lsb = new Integer(a & 1);
				s = lsb.toString() + s;
				a = a >> 1;
			}
			return s;
		}
}
