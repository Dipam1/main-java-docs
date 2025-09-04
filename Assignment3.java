import java.util.Scanner;

public class Assignment3{
	public static void main(String[] args) {
		checkIfAlphabet();
	}
	
	public static void checkIfAlphabet() {
		Scanner scanner = new Scanner(System.in);
		var close = true;
		while(close) {
		System.out.print("Enter a character or Press '0' to exit: ");
		
		char ch = scanner.next().charAt(0);
		if (ch == '0') {
			close = false;
			break;
		}
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is an alphabet.");
		} else {
			System.out.println(ch + " is not an alphabet.");
		}
		
	}
		scanner.close();
		}
}s