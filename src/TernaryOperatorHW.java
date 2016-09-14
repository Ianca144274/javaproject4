import java.util.Scanner;

public class TernaryOperatorHW {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please type the world \"Owl\"");
		String attempt = s.nextLine();
		owlMethod(attempt);
		
		s.close();
	}

	public static void owlMethod(String attempt) {
		String message = (attempt.equals("owl")) ? "correct!" : "wrong!";
		for (int i=0; i<20; i++) {
			if (i % 2 == 0) {
				System.out.println(message.toUpperCase());
				} else {
					System.out.println(message.toLowerCase());
				}
		}
	}
}
