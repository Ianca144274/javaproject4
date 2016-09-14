import java.util.Scanner;

public class array_project3 {
	
	public static void main(String [] args) {				
				
		Scanner s = new Scanner(System.in);
		System.out.println("How many conacts would you like to store?");
		int numberOfNamesToStore = s.nextInt();
		s.nextLine();
		System.out.println("Each contact needs to have a: (1) name, (2) email, and (3) phone");
		UserInfo[] contacts = new UserInfo[numberOfNamesToStore];
		
		for (int i = 0; i < numberOfNamesToStore; i++) {
			System.out.println("Enter Name #" + (i+1) + ": ");	
			String name = s.nextLine();
			System.out.println("Enter Email #" + (i+1) + ": ");
			String email = s.nextLine();
			System.out.println("Enter Phone #" + (i+1) + ": ");
			String phone = s.nextLine();
			UserInfo c = new UserInfo(name, email, phone);
			contacts[i] = c;
		}
		
		s.close();
	}
	
	public static String[] enteredNames(int numberOfNamesToStore, Scanner s) {
		String[] listOfNames = new String[numberOfNamesToStore];
		
		for (int i = 0; i < numberOfNamesToStore; i++) {
			listOfNames[i] = s.nextLine();
		}
		
		return listOfNames;
	}
	
	//public static String[] 
}
