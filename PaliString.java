
public class PaliString {
	public static void main(String[] args) {
		String s = "mommomm";
		char[] ch_Input = s.toCharArray();
		int length = ch_Input.length - 1;
		boolean ispal=true;
		System.out.println(length);
		for (int i = 0; i < ch_Input.length / 2; i++) {
			char c = ch_Input[i];
			char d = ch_Input[length - i];
			if (c != d) {
				ispal=false;
				System.out.println("string is not pal.");
				break;
			}

		}
		if(ispal)
		{
		System.out.println("string is pal.");
		}
	}
}
