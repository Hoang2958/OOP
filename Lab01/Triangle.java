
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
		    int n, k = 0;
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter n: ");
	        n = scanner.nextInt();
		    for (int i = 1; i <= n; ++i, k = 0) {
		      for (int t = 1; t <= n - i; ++t) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		    }
		  }
}

