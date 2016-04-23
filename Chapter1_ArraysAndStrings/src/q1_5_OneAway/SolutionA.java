package q1_5_OneAway;

/**
 * O(n)
 * @author Zach
 *
 */
public class SolutionA {
	public static boolean isOneAway(String s, String t){
		if(s.length()==t.length()){
			return oneReplace(s, t);
		}
		// if use > OR <, error will occur when two strings has more than one difference
		else if(s.length()==t.length()+1){
			return oneEdit(s,t);
		}
		else if (t.length()==s.length()+1){
			return oneEdit(t,s);
		}
		return false;
	}

	private static boolean oneEdit(String s, String t) {
		int index1 = 0;
		int index2 = 0;
		while(index1<s.length() && index2<t.length()){
			if(s.charAt(index1) != t.charAt(index2)){
				if(index1 != index2 ){
					return false;
				}
				index1++;
			}
			else{
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean oneReplace(String s, String t) {
		boolean foundReplace = false;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) != t.charAt(i)){
				if(foundReplace){
					return false;
				}
				foundReplace = true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isOneAway("apple", "applee"));
	}
}
