
import java.util.Scanner;

public class spring {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();

		
		if((month == 6 && date < 21) || (month == 3 && date > 19) || (month > 3 && month < 6))System.out.println("Its a Spring Season");
		else System.out.println("Not a Spring Season");
	}
}