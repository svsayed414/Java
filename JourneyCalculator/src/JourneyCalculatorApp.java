
public class JourneyCalculatorApp {

	public static void main(String[] args) 
	{
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.printf("%.2f", journeyCalculator.calculateDistance(60.0, 1.5));

	}

}
//
//////////////////////////////////////
//
//public class JourneyCalculator {
//
//public double calculateDistance(double speed, double time)
//
//{
//
//return speed*time;
//
//}
//
//}
//


//import java.util.Scanner;
//
//public class TheJourneyCalculatorApp {
//
//public static void main(String[] args) {
//
//Scanner scan=new Scanner(System.in);
//
//System.out.println("Enter speed and time as realnumbers");
//
//double speed=scan.nextDouble();
//
//double time=scan.nextDouble();
//
//JourneyCalculator journeyCalculator=new JourneyCalculator();
//
//System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
//
//}
//
//}    Here input is taken from user