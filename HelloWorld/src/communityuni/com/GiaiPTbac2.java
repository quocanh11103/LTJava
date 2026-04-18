package communityuni.com;
import java.util.Scanner;

public class GiaiPTbac2
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if (a != 0) 
        {
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } 
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiem kep x = " + x);
            } 
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            	}
        } 
        else 
        {
            if (b != 0)
                System.out.println("X = " + (-c / b));
            else 
            {
            	if (c != 0) 
            	{
            		System.out.println("Phuong trinh vo nghiem");
            	} 
            	else
            	{
            		System.out.println("Phuong trinh vo so nghiem");
            	}
            }

        	sc.close();
        
         }
    }
}
