import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("odd - ");
		for(int i = 1; i <= n; i += 2) System.out.print(i +  " ");
		System.out.println();
		System.out.println("even - ");
		for(int i = 2; i <= n; i += 2) System.out.print(i +  " ");
	}
}
