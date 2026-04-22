package communityuni.com;
import java.util.Scanner;
public class TenPanlyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập chuỗi cần kiểm tra: ");
	        String str = sc.nextLine();

	        int n = str.length();
	        boolean isPalindrome = true;

	        for (int i = 0; i < n / 2; i++)
	        {
	            if (str.charAt(i) != str.charAt(n - 1 - i)) 
	            {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) 
	        	{
	        		System.out.println("Là chuỗi palindrome");
	        	} 
	        else 
	        	{
	        		System.out.println("Không phải palindrome");
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
