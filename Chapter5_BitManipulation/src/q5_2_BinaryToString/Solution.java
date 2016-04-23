package q5_2_BinaryToString;

public class Solution {
	public static String printBinary(double num){
		if(num > 1 || num < 0){
			return "ERROR";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		while(num > 0){
			double r = num * 2;
			if(r > 1){
				sb.append(1);
				num = num -1;
			}
			else{
				sb.append(0);
				num = r;
			}
		}
		return sb.toString();
	}
	
	public static String printBinary2(double num){
		if(num > 1 || num < 0){
			return "ERROR";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		
		double frac = 0.5;
		while(num > 0){
			// set limit for frac
			if(sb.length() > 32){
				return "ERROR";
			}
			if(num > frac){
				sb.append(1);
				num -= frac;
			}
			else{
				sb.append(0);
			}
			frac = frac/2;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String bs1 = printBinary(.125);
		System.out.println(bs1);
		String bs2 = printBinary(.125);
		System.out.println(bs2);
	}
}
