import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =0;
        for(int i=1;i<=n;i++) 
        if(n%i==0) fact++;

        int arr[] = new int[fact];
        
		int j = 0;
		for(int i = 1; i <= n; i++) if(n % i == 0) {
			arr[j++] = i;
			System.out.print(i + " ");
		}

    }
}
