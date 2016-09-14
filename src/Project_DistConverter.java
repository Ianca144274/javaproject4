import java.util.Scanner;

public class Project_DistConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yesNo = "y";

		while (yesNo.equals("y")) {

			System.out.println("Please select a unit of measurement you wish to convert:");
			System.out.println("1. Inches");
			System.out.println("2. Feet");
			System.out.println("3. Yards");
			System.out.println("4. Miles");
			System.out.println("5. Leagues");
			int unit1 = s.nextInt();

			System.out.println("Please enter the value you wish to convert:");
			double value = s.nextDouble();

			System.out.println("Thank you, finally please select the unit you would like to convert your amount to");
			System.out.println("1. Inches");
			System.out.println("2. Feet");
			System.out.println("3. Yards");
			System.out.println("4. Miles");
			System.out.println("5. Leagues");
			int unit2 = s.nextInt();

			String convertedAmount = distConverter(unit1, unit2, value);
			System.out.println(convertedAmount);

			System.out.println("Would you like to convert another number today? Y or N:");
			s.nextLine();
			yesNo = s.nextLine();
			System.out.println(yesNo.toString() == "y");
		}
		s.close();

	}

	public static String distConverter(int unit1, int unit2, double value) {
		String convertedAmount = "";
		switch (unit1) {
		case 1: // inches

			switch (unit2) {
			case 1:
				convertedAmount = value + " inches";
				break;
			case 2:
				convertedAmount = (value / 12) + " feet";
				break;
			case 3:
				convertedAmount = (value / 36) + " yards";
				break;
			case 4:
				convertedAmount = (value / 63360) + " miles";
				break;
			case 5:
				convertedAmount = (value / 190080) + " leagues";
				break;
			}
			break;

		case 2: // feet

			switch (unit2) {
			case 1:
				convertedAmount = (value * 12) + " inches";
				break;
			case 2:
				convertedAmount = (value) + " feet";
				break;
			case 3:
				convertedAmount = (value / 3) + " yards";
				break;
			case 4:
				convertedAmount = (value / 5280) + " miles";
				break;
			case 5:
				convertedAmount = (value / 15840) + " leagues";
				break;
			}
			break;

		case 3: // yards

			switch (unit2) {
			case 1:
				convertedAmount = (value * 36) + " inches";
				break;
			case 2:
				convertedAmount = (value * 3) + " feet";
				break;
			case 3:
				convertedAmount = value + " yards";
				break;
			case 4:
				convertedAmount = (value / 1760) + " miles";
				break;
			case 5:
				convertedAmount = (value / 5280) + " leagues";
				break;
			}
			break;

		case 4: // miles

			switch (unit2) {
			case 1:
				convertedAmount = (value * 63360) + " inches";
				break;
			case 2:
				convertedAmount = (value * 5280) + " feet";
				break;
			case 3:
				convertedAmount = (value * 1760) + " yards";
				break;
			case 4:
				convertedAmount = value + " miles";
				break;
			case 5:
				convertedAmount = (value / 3) + " leagues";
				break;
			}
			break;

		case 5: // leagues:

			switch (unit2) {
			case 1:
				convertedAmount = (value * 190080) + " inches";
				break;
			case 2:
				convertedAmount = (value * 15840) + " feet";
				break;
			case 3:
				convertedAmount = (value * 5280) + " yards";
				break;
			case 4:
				convertedAmount = (value * 3) + " miles";
				break;
			case 5:
				convertedAmount = value + " leagues";
				break;
			}
			break;
		default:
			break;
		}
			return convertedAmount;
		
	}
}
