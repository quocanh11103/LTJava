package communityuni.com;
import java.util.*;

public class Tim_UCLN {
	 static int gcd(int a, int b) {
	        while (b != 0) {
	            int r = a % b;
	            a = b;
	            b = r;
	        }
	        return a;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("ƯCLN(" + a + ", " + b + ") = " + gcd(a, b));
    }


	}


