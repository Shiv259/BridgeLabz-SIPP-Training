import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		int sum = 0;
		while(k > 0) {
			int rem = k % 10;
			k /= 10;
			sum += rem;
		}
		
		if(sum == n) System.out.println("harshad no.");
		else System.out.println("not a harshad no.");
	}
}
