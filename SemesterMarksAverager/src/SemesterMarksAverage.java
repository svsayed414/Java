
public class SemesterMarksAverage {

	public static void main(String[] args) {
		
		System.out.printf("%.2f",calculateAverage(85, 79, 91, 76, 88, 95, 80, 85));

	}
	public static double calculateAverage(int sem1, int sem2, int sem3, 
			int sem4, int sem5, int sem6, int sem7, int sem8)
	{
		return (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8)/8 ;
	}

}
//////////////
// in return type i had given formula as divided by 8 that is int/int =int 84.00 as output
//but we wanted in double so int/double that is by 8.0 gives me double as answer
// int/ double = double 84.88 as output

///////////

//import java.util.Scanner;
//
//public class AvgCalculatorApp {
//
//public static void main(String[] args) {
//
//Scanner scan=new Scanner(System.in);
//
//System.out.println("Enter All eight sem marks ");
//
//int sem1=scan.nextInt();
//
//int sem2=scan.nextInt();
//
//int sem3=scan.nextInt();
//
//int sem4=scan.nextInt();
//
//int sem5=scan.nextInt();
//
//int sem6=scan.nextInt();
//
//int sem7=scan.nextInt();
//
//int sem8=scan.nextInt();
//
//System.out.printf("%.2f",calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
//
//scan.close();
//
//}
//
//public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8)
//
//{
//
//return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;
//
//}
//
//}