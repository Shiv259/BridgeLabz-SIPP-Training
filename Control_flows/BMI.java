import java.util.Scanner;

public class BMI {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextInt();
		double bmi = (w/(h*h))*10000;
		if(bmi <= 18.4) System.out.println("underweight");
		else if(bmi < 24.9) System.out.println("normal");
		else System.out.println("obese");
	}
}
