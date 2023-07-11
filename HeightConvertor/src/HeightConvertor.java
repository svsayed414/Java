
//import java.util.Scanner;
//public class HeightConvertor {
//
//	public static void main(String[] args)
//	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the inches :");
//		double inch = scan.nextDouble();
//		
//		HeightConvertor convertor = new HeightConvertor();
//
//		System.out.printf(convertor.convertInchesToFeet(inch));
//
//	}
//
//}

//import java.util.Scanner;
//
//public class HeightConvertor {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the inches:");
//        double inch = scan.nextDouble();
//
//        HeightConverter converter = new HeightConverter();
//
//        System.out.println(converter.convertInchesToFeet(inch));
//    }
//}


//import java.util.Scanner;
//
//public class HeightConvertor {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the inches:");
//		double inch = scan.nextDouble();
//
//		HeightConvertor converter = new HeightConvertor();
//
//		System.out.println(converter.convertInchesToFeet(inch));
//
//	}
//
//}



import java.util.Scanner;

public class HeightConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the inches:");
        double inch = scan.nextDouble();

        HeightConvertor convertor = new HeightConvertor();

        System.out.println(convertor.convertInchesToFeet(inch));
    }

    public double convertInchesToFeet(double inches) {
        return inches / 12.0;
    }
}
/////////




