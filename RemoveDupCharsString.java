package amazon;

import java.util.LinkedHashSet;

public class RemoveDupCharsString {
	public String removeDups(String string) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));
		}
		return set.toString();
	}

	public static void main(String[] args) {
		RemoveDupCharsString az = new RemoveDupCharsString();
		System.out.println(az.removeDups("aab bcc dde"));
	}
}
