import java.util.Scanner;
public class lle00Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = "Luyen", lastName = "Le";
		double costofgpg = 0.00;
		final double classPeriods = 44;
		double milesfromUAFS = 7.1;
		double mpg = 28.0;
		int weeks = 16;
		int days = 5;
		int oneWay = 12;

		System.out.print("Enter the cost of gas per gallon. ");
		costofgpg = scan.nextDouble();
		System.out.println();
		scan.close();		

		System.out.print("Student mileage report              "+firstName+" "+lastName+"\n");
		System.out.print("============================================"+"\n");

		//calcMethod1
		double method1 = calcMethod1(classPeriods, milesfromUAFS);
		System.out.printf("Miles per trip                        %.1f%n", milesfromUAFS);
		System.out.printf("Mileage this semester                 %.2f%n", method1);

		System.out.printf("Cost of gas per gallon                $%.2f%n", costofgpg);
		System.out.printf("Miles per gallon                      %.0f%n", mpg);

		// calcMethod2
		double method2 = calcMethod2(milesfromUAFS, costofgpg, mpg);
		System.out.printf("Cost of gas per trip                  $%,.2f%n", method2);

		// calcMethod3
		int method3 = calcMethod3(weeks, days);
		System.out.printf("Number of trips                       %d%n", method3);

		// calcMethod4 and calcMethod5
		double method4 = calcMethod4(oneWay, milesfromUAFS, classPeriods);
		double method5 = calcMethod5(oneWay, milesfromUAFS, classPeriods);

		System.out.printf("Hours/min in the car       %.0f hrs     %.0f min%n", method4, method5);

		// calcMethod6
		double method6 = calcMethod6(method1, mpg, costofgpg);
		System.out.printf("Cost of gas for the semester          $%,.2f%n", method6);

	}

	public static double calcMethod1(double classPeriods, double milesfromUAFS) {
		double milesthisemester = milesfromUAFS * classPeriods;
		return milesthisemester;
	}

	public static double calcMethod2(double milesfromUAFS, double costofgpg, double mpg) {
		double costofgptCALC = (milesfromUAFS / mpg) * costofgpg;
		return costofgptCALC; 
	}

	public static int calcMethod3(int weeks, int days) {
		int numofTrips = weeks * days * 2;
		return numofTrips;
	}

	//calculation for hours in car
	public static int calcMethod4(int oneWay, double milesfromUAFS, double classPeriods) {
		int tripsEachSemester = (int) (oneWay * 2 * classPeriods);
		//60 is number of minutes in 1 hour
		int hoursinCar = (int) tripsEachSemester / 60; 
		return hoursinCar;
	}

	//calculation for minutes in car
	public static int calcMethod5(int oneWay, double milesfromUAFS, double classPeriods) {
		int tripsEachSemester = (int) (oneWay * 2 * classPeriods);
		//60 is number of minutes in 1 hour
		int mininCar = (int) tripsEachSemester % 60;
		return mininCar;
	}

	public static double calcMethod6(double milesThisSemester, double mpg, double costofgpg) {
		double costofgasCALC = (milesThisSemester / mpg) * costofgpg;
		return costofgasCALC;
	}
}