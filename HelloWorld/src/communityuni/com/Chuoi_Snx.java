package communityuni.com;
import java.util.Scanner;
public class Chuoi_Snx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập x: ");
	        double x = sc.nextDouble();
	        System.out.print("Nhập n: ");
	        int n = sc.nextInt();

	        double S = 0;
	        double term = x;       
	        double fact = 1;      
	        double xSq = x * x;

	        for (int k = 0; k <= n; k++) {
	            S += term;
	            
	            int p = 2 * k + 2;
	            fact = fact * p * (p + 1);
	            term = term * xSq / (p * (p + 1));
	        }

	        System.out.printf("S(%g, %d) = %.10f%n", x, n, S);
	        System.out.printf("Math.sin(x)   = %.10f%n", Math.sin(x));
	    }
	}


