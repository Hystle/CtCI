package q1_3_URLify;

/**
 * O(n)
 * input string and output string require two different index
 * @author Zach
 *
 */
public class SolutionA {
	public static String urlify(String str, int length){
		
		int spaceCount = 0, newLength = 0;
		char [] chars = str.toCharArray();
		
		// calculate new length
		for(char c : chars){
			if(c == ' '){
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		
		// index for newChars
		int j = newLength-1;
		char [] newChars = new char[newLength];
		
		for(int i = length-1; i>=0; i--){
			if(str.charAt(i) == ' '){
				newChars[j] = '0';
				newChars[j-1] = '2';
				newChars[j-2] = '%';
				j = j - 3;
			}
			else{
				newChars[j] = chars[i];
				j--;
			}
		}
		return new String(newChars);
	}
	
	public static void main(String[] args) {
		System.out.println(urlify("MyNameisZZC   ", 14));
	}
}
