package communityuni.com;
import java.util.Scanner;
public class So_Hoan_Thien {
	 static boolean isPerfect(int n) {
	        if (n < 2) return false;
	        int sum = 1;
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                sum += i;
	                if (i != n / i) sum += n / i;
	            }
	        }
	        return sum == n;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        if (isPerfect(n))
            System.out.println(n + " là số hoàn thiện.");
        else
            System.out.println(n + " không phải số hoàn thiện.");
    }

}


