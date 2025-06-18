import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		int sum = 0;
		while(k > 0) {
			int rem = k % 10;
			k /= 10;
			sum += rem*rem*rem;
		}
		
		if(sum == n) System.out.println("armstrong  no.");
		else System.out.println("not a armstrong no.");
	}
}
