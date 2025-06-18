import java.util.Scanner;

public class greatest_factor {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		int i = n-1;
		while(i > 1) {
			if(n % i == 0) {
				break;
			}
			i--;
		}
		System.out.println(i);
	}
}
