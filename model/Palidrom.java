package model;

public class Palidrom {

	public static void main(String[] args) {
		String word = "MADAM";

		char ch[] = word.toCharArray();
		boolean ispal = true;
		//String rev = "";
		int length = ch.length-1;
		System.out.println(length);
		for (int i = 0; i < ch.length / 2 ; i++) {
			if (ch[i] != ch[length - i]) {
				ispal = false;
				break;
			}
		}
		if (ispal) {
			System.out.println("string is  palidrome");
		}

		else {
			System.out.println("string is not palidrome");
		}

	}

}
