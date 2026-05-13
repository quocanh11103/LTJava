package communityuni.com;
import java.util.Scanner;
public class Kiem_Tra_Toan_Chan {
	 static boolean allEven(int n) {
	        if (n == 0) return true;
	        n = Math.abs(n);
	        while (n > 0) {
	            if ((n % 10) % 2 != 0) return false;
	            n /= 10;
	        }
	        return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập n: ");
	        int n = sc.nextInt();
	        if (allEven(n))
	            System.out.println(n + " có toàn chữ số chẵn.");
	        else
	            System.out.println(n + " không có toàn chữ số chẵn.");

	}

}
