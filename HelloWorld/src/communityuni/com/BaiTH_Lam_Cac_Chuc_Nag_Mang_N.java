package communityuni.com;
import java.util.*;
public class BaiTH_Lam_Cac_Chuc_Nag_Mang_N {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
		 Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Nhập số phần tử N: ");
	        int n = sc.nextInt();

	        int[] a = new int[n];

	       
	        System.out.println("Nhập các phần tử:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("a[" + i + "] = ");
	            a[i] = sc.nextInt();
	        }

	        
	        System.out.println("Mảng vừa nhập:");
	        for (int x : a) {
	            System.out.print(x + " ");
	        }

	        int sum = 0;
	        for (int x : a) {
	            sum += x;
	        }
	        System.out.println("\nTổng mảng: " + sum);

	        
	        System.out.print("Nhập K: ");
	        int k = sc.nextInt();
	        int count = 0;
	        for (int x : a) {
	            if (x == k) count++;
	        }
	        System.out.println("Số lần xuất hiện của " + k + ": " + count);

	     
	        int max = a[0], min = a[0];
	        for (int x : a) {
	            if (x > max) max = x;
	            if (x < min) min = x;
	        }
	        System.out.println("Phần tử lớn nhất: " + max);
	        System.out.println("Phần tử nhỏ nhất: " + min);

	     
	        System.out.println("Các số nguyên tố:");
	        for (int x : a) {
	            if (x > 1) {
	                boolean isPrime = true;
	                for (int i = 2; i <= Math.sqrt(x); i++) {
	                    if (x % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	                if (isPrime) System.out.print(x + " ");
	            }
	        }

	        
	        int[] tang = a.clone();
	        Arrays.sort(tang);
	        System.out.println("\nMảng tăng dần:");
	        for (int x : tang) {
	            System.out.print(x + " ");
	        }

	      
	        System.out.println("\nMảng giảm dần:");
	        for (int i = tang.length - 1; i >= 0; i--) {
	            System.out.print(tang[i] + " ");
	        }

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


