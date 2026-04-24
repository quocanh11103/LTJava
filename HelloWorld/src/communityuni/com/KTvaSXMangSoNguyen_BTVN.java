package communityuni.com;
import java.util.*;
public class KTvaSXMangSoNguyen_BTVN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 Scanner sc = new Scanner(System.in);

	        
	        int n;
	        do {
	            System.out.print("Nhap so phan tu N (>0): ");
	            n = sc.nextInt();
	        } while (n <= 0);

	        int[] arr = new int[n];

	        
	        System.out.println("Nhap cac phan tu:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("arr[" + i + "] = ");
	            arr[i] = sc.nextInt();
	        }

	        
	        System.out.print("Mang vua nhap: ");
	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
	        System.out.println();

	      
	        int sum = 0;
	        for (int x : arr) {
	            sum += x;
	        }
	        System.out.println("Tong mang = " + sum);

	       
	        System.out.print("Nhap K: ");
	        int k = sc.nextInt();
	        int count = 0;
	        for (int x : arr) {
	            if (x == k) count++;
	        }
	        System.out.println("So lan xuat hien cua " + k + " = " + count);

	        
	        int max = arr[0];
	        int min = arr[0];

	        for (int x : arr) {
	            if (x > max) max = x;
	            if (x < min) min = x;
	        }

	        System.out.println("Phan tu lon nhat: " + max);
	        System.out.println("Phan tu nho nhat: " + min);

	       
	        System.out.print("Cac so nguyen to: ");
	        boolean coNguyenTo = false;

	        for (int x : arr) {
	            if (x >= 2) {
	                boolean isPrime = true;
	                for (int i = 2; i <= Math.sqrt(x); i++) {
	                    if (x % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	                if (isPrime) {
	                    System.out.print(x + " ");
	                    coNguyenTo = true;
	                }
	            }
	        }
	        if (!coNguyenTo) System.out.print("Khong co");
	        System.out.println();

	     
	        int[] tang = arr.clone();
	        Arrays.sort(tang);
	        System.out.print("Mang tang dan: ");
	        for (int x : tang) {
	            System.out.print(x + " ");
	        }
	        System.out.println();

	     
	        System.out.print("Mang giam dan: ");
	        for (int i = tang.length - 1; i >= 0; i--) {
	            System.out.print(tang[i] + " ");
	        }
	        System.out.println();

	        sc.close();
	    }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		finally
		{
			System.out.println("finally");
		}
	}


}


