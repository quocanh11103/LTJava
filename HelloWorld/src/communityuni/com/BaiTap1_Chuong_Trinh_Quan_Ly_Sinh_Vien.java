package communityuni.com;
import java.util.*;

public class BaiTap1_Chuong_Trinh_Quan_Ly_Sinh_Vien {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();
        int chon;

        try {
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Sửa sinh viên");
                System.out.println("4. Xóa sinh viên theo tên");
                System.out.println("5. Tìm sinh viên có chữ 'An'");
                System.out.println("6. Sắp xếp danh sách");
                System.out.println("7. Số lượng sinh viên");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                chon = sc.nextInt();
                sc.nextLine();

                switch (chon) {
                    case 1:
                        System.out.print("Nhập tên sinh viên: ");
                        String ten = sc.nextLine();
                        ds.add(ten);
                        break;

                    case 2:
                        System.out.println("Danh sách sinh viên:");
                        for (String sv : ds) {
                            System.out.println(sv);
                        }
                        break;

                    case 3:
                        System.out.print("Nhập vị trí cần sửa: ");
                        int vt = sc.nextInt();
                        sc.nextLine();
                        if (vt >= 0 && vt < ds.size()) {
                            System.out.print("Nhập tên mới: ");
                            ds.set(vt, sc.nextLine());
                        } else {
                            System.out.println("Vị trí không hợp lệ!");
                        }
                        break;

                    case 4:
                        System.out.print("Nhập tên cần xóa: ");
                        String xoa = sc.nextLine();
                        ds.removeIf(s -> s.contains(xoa));
                        break;

                    case 5:
                        System.out.println("Sinh viên có chữ 'An':");
                        for (String sv : ds) {
                            if (sv.contains("An")) {
                                System.out.println(sv);
                            }
                        }
                        break;

                    case 6:
                        Collections.sort(ds);
                        System.out.println("Đã sắp xếp!");
                        break;

                    case 7:
                        System.out.println("Số lượng: " + ds.size());
                        break;

                    case 0:
                        System.out.println("Thoát...");
                        break;

                    default:
                        System.out.println("Chọn sai!");
                }

            } while (chon != 0);

        } 
        catch (Exception ex)
        {
            
            ex.printStackTrace();
        } 
        finally 
        {
            System.out.println("Kết thúc chương trình!");
            sc.close();
        }
    }
}