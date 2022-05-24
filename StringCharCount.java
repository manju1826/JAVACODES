
public class StringCharCount {
	

	    public static void main(String[] args) {
	        int charCount = charCount("MADAMMMMMMM", 'D');
	        System.out.println("CharCount:  " + charCount);
	    }

	    private static int charCount(String input, char match) {
	        char[] chars = input.toCharArray();
	        int counter = 0;
	        for (char c : chars) {
	            if (c == match) {
	                counter = counter + 1;
	            }
	        }
	        return counter;
	    }

	}

