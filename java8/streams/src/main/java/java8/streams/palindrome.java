package java8.streams;
import java.util.*;
import java.util.function.Predicate;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("madam","malayalam","atta","jahnavi");
		List<String> palindromes = palindrome.filterList(strings,StrPredicate::isPalindrome);
		System.out.println(palindromes);
	}
	public static List<String> filterList(List<String>li, Predicate<String> pre) {
		List<String> finalList = new ArrayList<>();
		for (String st:li) {
			if (pre.test(st)) {
				finalList.add(st);
			}
		}
		return finalList;
	}

}
