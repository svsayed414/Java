import java.util.Scanner;

public class TheTemperatureConvertor {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the degree :");
		double fahrenheit = scan.nextDouble();
		
		TemperatureConvertor temperatureConvertor = new TemperatureConvertor();

		System.out.printf("%.2f",temperatureConvertor.convertFahrenheitToCelsius(fahrenheit));
		
	}

}

//import java.util.Scanner;
//
//public class TheTemperatureConverter {
//
//public static void main(String[] args) {
//
//Scanner scan=new Scanner(System.in);
//
//System.out.println("Enter temp in F");
//
//double f=scan.nextDouble();
//
//TemperatureConverter temperatureConverter=new TemperatureConverter();
//
//System.out.printf("%.2f",TemperatureConverter.convertFahrenheitToCelsius(f));
//
//}
//
//}