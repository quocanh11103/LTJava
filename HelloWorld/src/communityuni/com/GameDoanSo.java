package communityuni.com;
import java.util.Random;
import java.util.Scanner;
public class GameDoanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String choiTiep;
        do {
            int soMay = rd.nextInt(101); // 0 -> 100
            int soLanDoan = 0;
            boolean thang = false;

           
            System.out.println("Đoán số từ 0 đến 100. Bạn có 7 lần!");

            while (soLanDoan < 7) {
                System.out.print("Nhập số bạn đoán: ");
                int doan = sc.nextInt();
                soLanDoan++;

                if (doan == soMay) {
                    System.out.println(" Chính xác! Bạn WIN!");
                    thang = true;
                    break;
                } else if (doan < soMay) {
                    System.out.println("Số bạn đoán NHỎ hơn.");
                } else {
                    System.out.println("Số bạn đoán LỚN hơn.");
                }

                System.out.println("Còn lại " + (7 - soLanDoan) + " lần.");
            }

            if (!thang) {
                System.out.println("QUÁ 7 LẦN RỒI! GAME OVER NHA THÍM! Số đúng là: " + soMay);
            }

            System.out.print("Bạn có muốn chơi lại không? (y/n): ");
            choiTiep = sc.next();

        } while (choiTiep.equalsIgnoreCase("y"));

        System.out.println("Cảm ơn bạn đã chơi!");
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
