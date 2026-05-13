package communityuni.com;

import java.util.ArrayList;

// ==================== LỚP TRỪU TƯỢNG (ABSTRACT CLASS) ====================
abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name    = name;
        this.address = address;
        this.phone   = phone;
    }

    @Override
    public String toString() {
        return "Họ tên  : " + name
             + "\nĐịa chỉ : " + address
             + "\nSĐT     : " + phone;
    }

    // Phương thức trừu tượng tính lương
    public abstract double pay();
}

// ==================== TÌNH NGUYỆN VIÊN (VOLUNTEER) ====================
class Volunteer extends StaffMember {

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "[Tình nguyện viên]\n" + super.toString()
             + "\nTiền lương: $0.0 (Tình nguyện viên không hưởng lương)";
    }
}

// ==================== NHÂN VIÊN (EMPLOYEE) ====================
class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone,
                    String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate              = payRate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return "[Nhân viên]\n" + super.toString()
             + "\nMã số BHXH: " + socialSecurityNumber
             + "\nMức lương : $" + payRate;
    }
}

// ==================== CẤP QUẢN LÝ (EXECUTIVE) ====================
class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = 0.0;
    }

    public void awardBonus(double execBonus) {
        if (execBonus < 0) throw new IllegalArgumentException("Tiền thưởng không được là số âm: " + execBonus);
        this.bonus = execBonus;
    }

    @Override
    public double pay() {
        double total = payRate + bonus;
        bonus = 0.0; // reset tiền thưởng sau khi nhận lương
        return total;
    }

    @Override
    public String toString() {
        return "[Quản lý]\n" + name
             + "\nĐịa chỉ    : " + address
             + "\nĐiện thoại : " + phone
             + "\nMã số BHXH : " + socialSecurityNumber
             + "\nMức lương  : $" + payRate
             + "\nTiền thưởng: $" + bonus;
    }
}

// ==================== NHÂN VIÊN TÍNH GIỜ (HOURLY) ====================
class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone,
                  String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        if (moreHours < 0) throw new IllegalArgumentException("Số giờ làm việc không được âm: " + moreHours);
        this.hoursWorked += moreHours;
    }

    @Override
    public double pay() {
        double total = payRate * hoursWorked;
        hoursWorked = 0; // reset số giờ sau khi nhận lương
        return total;
    }

    @Override
    public String toString() {
        return "[NV Tính giờ]\n" + name
             + "\nĐịa chỉ     : " + address
             + "\nĐiện thoại   : " + phone
             + "\nMã số BHXH   : " + socialSecurityNumber
             + "\nLương mỗi giờ: $" + payRate + "/giờ"
             + "\nSố giờ làm   : " + hoursWorked + " giờ";
    }
}

// ==================== QUẢN LÝ NHÂN SỰ (STAFF) ====================
class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();
    }

    public void addMember(StaffMember member) {
        if (member == null) throw new NullPointerException("Thành viên không được để trống (null)");
        staffList.add(member);
    }

    public void payday() {
        if (staffList.isEmpty()) throw new RuntimeException("Danh sách nhân sự trống, không có ai để trả lương!");

        double totalPayout = 0.0;
        System.out.println("============================================================");
        System.out.println("                     KỲ TRẢ LƯƠNG NHÂN VIÊN                 ");
        System.out.println("============================================================");

        for (StaffMember member : staffList) {
            try {
                System.out.println(member.toString());
                double amount = member.pay();
                System.out.printf(">>> Lương thực nhận kỳ này: $%.2f%n", amount);
                totalPayout += amount;
            } catch (Exception e) {
                System.out.println("!!! Lỗi khi xử lý lương cho: " + member.name);
                System.out.println("    Lý do: " + e.getMessage());
            } finally {
                System.out.println("------------------------------------------------------------");
            }
        }

        System.out.printf(">>> TỔNG SỐ TIỀN CHI TRẢ: $%.2f%n", totalPayout);
        System.out.println("============================================================");
    }
}

// ==================== LỚP CHÍNH (MAIN) ====================
public class BaiTH_Xay_Dung_Chuong_Trinh_Theo_Mo_Hinh_Lop {

    public static void main(String[] args) {
        // Khởi tạo hệ thống quản lý nhân sự
        Staff staff = new Staff();

        try {
            // --- Tình nguyện viên ---
            Volunteer v1 = new Volunteer("An Nguyễn", "123 Lê Lợi, TP.HCM", "0901234567");

            // --- Quản lý/Lãnh đạo ---
            Executive ex1 = new Executive("Bình Trần", "456 Nguyễn Huệ, TP.HCM", "0912345678", "BHXH-001", 5000.0);
            ex1.awardBonus(1500.0);

            // --- Nhân viên tính giờ ---
            Hourly h1 = new Hourly("Cường Lê", "789 Hai Bà Trưng, TP.HCM", "0923456789", "BHXH-002", 20.0);
            h1.addHours(80);

            Hourly h2 = new Hourly("Dũng Phạm", "321 CMT8, TP.HCM", "0934567890", "BHXH-003", 25.0);
            h2.addHours(60);

            // --- Thêm vào danh sách quản lý ---
            staff.addMember(v1);
            staff.addMember(ex1);
            staff.addMember(h1);
            staff.addMember(h2);

            // --- Thực hiện trả lương ---
            staff.payday();

            // --- Kiểm tra các trường hợp lỗi (Test cases) ---
            
            System.out.println("\n>>> Kiểm thử: Tiền thưởng âm");
            Executive ex2 = new Executive("Sếp Lỗi", "999 Đường Lỗi", "0000000000", "BHXH-ERR", 3000.0);
            try {
                ex2.awardBonus(-500); // Sẽ ném ra ngoại lệ
            } catch (IllegalArgumentException e) {
                System.out.println("Đã bắt lỗi: " + e.getMessage());
            }

            System.out.println("\n>>> Kiểm thử: Số giờ làm âm");
            Hourly h3 = new Hourly("Công Nhân Lỗi", "000 Đường Sai", "0000000001", "BHXH-ERR2", 15.0);
            try {
                h3.addHours(-10); // Sẽ ném ra ngoại lệ
            } catch (IllegalArgumentException e) {
                System.out.println("Đã bắt lỗi: " + e.getMessage());
            }

            System.out.println("\n>>> Kiểm thử: Thêm giá trị null vào danh sách");
            try {
                staff.addMember(null);
            } catch (NullPointerException e) {
                System.out.println("Đã bắt lỗi: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        } finally {
            System.out.println("\n============================================================");
            System.out.println("           Chương trình kết thúc (khối finally)            ");
            System.out.println("============================================================");
        }
    }
}