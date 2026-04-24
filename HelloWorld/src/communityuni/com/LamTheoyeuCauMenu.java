package communityuni.com;
import java.util.*;
public class LamTheoyeuCauMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	      
	        int n;
	        do {
	            System.out.print("Nhap so luong phan tu (>0): ");
	            n = sc.nextInt();
	        } while (n <= 0);

	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
	            list.add(sc.nextInt());
	        }

	        int choice;
	        do {
	            System.out.println("\n Chọn chức năng Menu thực hiện ");
	            System.out.println("1. Them");
	            System.out.println("2. Sua");
	            System.out.println("3. Xoa");
	            System.out.println("4. Tim kiem");
	            System.out.println("5. Sap xep tang");
	            System.out.println("6. Sap xep giam");
	            System.out.println("7. Xuat danh sach");
	            System.out.println("0. Thoat");
	            System.out.print("Chon: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: 
	                    System.out.print("Nhap gia tri can them: ");
	                    int x = sc.nextInt();
	                    list.add(x);
	                    break;

	                case 2: 
	                    System.out.print("Nhap vi tri can sua: ");
	                    int sua = sc.nextInt();
	                    if (sua >= 0 && sua < list.size()) {
	                        System.out.print("Nhap gia tri moi: ");
	                        int newVal = sc.nextInt();
	                        list.set(sua, newVal);
	                    } else {
	                        System.out.println("Vi tri khong hop le!");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Nhap vi tri can xoa: ");
	                    int xoa = sc.nextInt();
	                    if (xoa >= 0 && xoa < list.size()) {
	                        list.remove(xoa);
	                    } else {
	                        System.out.println("Vi tri khong hop le!");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Nhap gia tri can tim: ");
	                    int k = sc.nextInt();
	                    boolean found = false;
	                    for (int i = 0; i < list.size(); i++) {
	                        if (list.get(i) == k) {
	                            System.out.println("Tim thay tai vi tri: " + i);
	                            found = true;
	                        }
	                    }
	                    if (!found) System.out.println("Khong tim thay!");
	                    break;

	                case 5: 
	                    Collections.sort(list);
	                    System.out.println("Da sap xep tang dan!");
	                    break;

	                case 6: 
	                    Collections.sort(list, Collections.reverseOrder());
	                    System.out.println("Da sap xep giam dan!");
	                    break;

	                case 7:
	                    System.out.println("Danh sach: " + list);
	                    break;

	                case 0:
	                    System.out.println("Thoat chuong trinh.");
	                    break;

	                default:
	                    System.out.println("Lua chon khong hop le!");
	            }

	        } while (choice != 0);

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
