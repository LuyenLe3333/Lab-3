import java.util.Scanner;
public class lle00Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = "Luyen", lastName = "Le";
		double costofgpg = 0.00;
		System.out.print("Enter the cost of gas per gallon. ");
		costofgpg = scan.nextDouble();
		System.out.println();
		scan.close();		
		System.out.print("Student mileage report              "+firstName+" "+lastName+"\n");
		System.out.print("============================================"+"\n");
//---------------------------------------------------------------------------------------------------		
		final double classPeriods = 44;
		double milesfromUAFS = 7.1;
		calcMethod1(classPeriods, milesfromUAFS);
		double method1 = calcMethod1(classPeriods, milesfromUAFS);
		System.out.print("Miles per trip 			         "+milesfromUAFS+"\n");
		System.out.print("Mileage this semester 		       "+method1+"\n");
//---------------------------------------------------------------------------------------------------		
		double mpg = 28.0;
		System.out.print("Cost of gas per gallon                 $"+costofgpg+"\n");
		System.out.print("Miles per gallon                        "+mpg+"\n");
//---------------------------------------------------------------------------------------------------		
		calcMethod2(milesfromUAFS, costofgpg, mpg);
		double method2 = calcMethod2(milesfromUAFS, costofgpg, mpg);
		System.out.print("Cost of gas per trip          	       ");
		System.out.printf("$"+"%,.2f",method2);
		System.out.println();
//---------------------------------------------------------------------------------------------------		
		int weeks = 16;
		int days = 5;
		calcMethod3(weeks, days);
		int method3 = calcMethod3(weeks, days);
		System.out.print("Number of trips                		 "+method3+"\n");
//---------------------------------------------------------------------------------------------------		
		int oneWay = 12;
		calcMethod4(oneWay, milesfromUAFS, classPeriods);
		calcMethod5(oneWay, milesfromUAFS, classPeriods);
		double method4 = calcMethod4(oneWay, milesfromUAFS, classPeriods);
		double method5 = calcMethod5(oneWay, milesfromUAFS, classPeriods);
		System.out.print("Hours/min in the car   ");
		System.out.print(method4+" hours    "+method5+" min "+"\n");
//---------------------------------------------------------------------------------------------------		
		calcMethod6(milesfromUAFS, mpg, costofgpg);
		double method6 = calcMethod6(milesfromUAFS, mpg, costofgpg);
		System.out.print("Cost of gas for the semester           $");
		System.out.printf("%,.2f",method6);
//---------------------------------------------------------------------------------------------------		

	}
	
	public static double calcMethod1(double classPeriods, double milesfromUAFS)
	{
		double milesthisemester = (milesfromUAFS * 2 * classPeriods) / 2;
		return milesthisemester;
	}//end of calcMethod1
	
	public static double calcMethod2(double milesfromUAFS, double costofgpg, double mpg)
	{
		double costofgptCALC = (costofgpg / mpg) * milesfromUAFS;
		return costofgptCALC; 
	}//end of calcMethod2
	
	public static int calcMethod3(int weeks, int days)
	{
		int numofTrips = weeks * days * 2;
		return numofTrips;
	}//end of calcMethod3
	
	public static int calcMethod4(int oneWay, double milesfromUAFS, double classPeriods)
	{
		int hours = 60;
		final int tripseachsemester = (int) (2 * classPeriods);
		int hoursinCar = (int) (oneWay * tripseachsemester) / hours; 
		return hoursinCar; 
	}//end of calcMethod4
	
	public static int calcMethod5(int oneWay, double milesfromUAFS, double classPeriods)
	{
		int hours = 60;
		final int tripseachsemester = (int) (2 * classPeriods);
		int mininCar = (int) (oneWay * tripseachsemester) % hours;
		return mininCar; 
	}//end of calcMethod5
	
	public static double calcMethod6(double milesfromUAFS, double mpg, double costofgpg)
	{
		double costofgasCALC = (milesfromUAFS / mpg) * costofgpg;
		return costofgasCALC;
	}//end of calcMethod6

}