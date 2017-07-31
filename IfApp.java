import java.util.Scanner;


public class IfApp {

	public static void main(String[] args) {

		boolean female=true;
		double val, height;

		System.out.println("Hello World!");

		Scanner s = new Scanner(System.in);

		System.out.println("How much cash have you got?");

		val = Double.parseDouble(s.nextLine());

		System.out.println("You have " + val + " pounds in cash");



		if(val >=20) {
			System.out.println("You are rich!");
		}
		else {
			System.out.println("You are poor!");
		}


		System.out.println("How tall are you in metres?");

		height = Double.parseDouble(s.nextLine());

		System.out.println("Your height is " + height +"m");

		System.out.println("Are you female?");

		//female = Boolean.parseBoolean(s.nextLine());

		if(s.nextLine().equals("yes"))
			female=true;
		else {
			System.out.println("What a shame.");
			female=false;
		}
		
		if(female) {
			if(height <1.0) {
				System.out.println("You need some heels!");
			}
			else if (height >=1.0 && height <2.0) {
				System.out.println("You're decently average :)");
			}
			else if(height >=2.0) {
				System.out.println("You're wayyyyyyy to tall!");
			}
		}

		System.out.println("Bye!");
		s.close();
	}

}
