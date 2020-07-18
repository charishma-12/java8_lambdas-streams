package java8.streams;

public class StrPredicate {
	public static boolean isPalindrome(String st){
		int n = st.length();
		int r = n-1;
		int l=0;
		while(l<r) {
			if(st.charAt(l) != st.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

}
