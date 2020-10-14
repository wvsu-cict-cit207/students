import java.util.Scanner;
import java.util.Arrays;

public class anagrams{
	
    static boolean isAnagram(String a, String b) {
	boolean detect = false;

	if (a.length() != b.length()) {
		detect = false;
	} else {

		char[] first = a.toCharArray(), second = b.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);

		for (int i = 0; i < a.length(); i++) {
			System.out.print(first[i]);
		}

		System.out.println();

		for (int i = 0; i < a.length(); i++) {
			System.out.print(second[i]);
		}
		for (int i = 0; i < a.length(); i++) {
			if (first[i] == second[i]) {
				detect = true;
			} else {
				detect = false;
				break;
			}
		}
	}

	return detect;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}

