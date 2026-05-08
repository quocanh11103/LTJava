package communityuni.com;


public class Xay_Dung_Lop_Nhan_Vien {

    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien("Nguyen", "An", 35);   // SoSP hợp lệ
        NhanVien nv2 = new NhanVien("Tran",   "Binh", 55); // SoSP hợp lệ
        NhanVien nv3 = new NhanVien("Le",     "Chi", 90);  // SoSP hợp lệ
        NhanVien nv4 = new NhanVien("Pham",   "Dung", -5); // SoSP âm → sẽ tự gán bằng 0

      
        NhanVien[] dsNV = {nv1, nv2, nv3, nv4};

        System.out.println("===== DANH SÁCH NHÂN VIÊN =====");
        for (NhanVien nv : dsNV) {
            nv.hienThi();
            System.out.println("-------------------------------");
        }
        System.out.println("===============================");
    }
}


class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
       
        this.soSP = (soSP < 0) ? 0 : soSP;
    }

    // Getter và Setter
    public String getHo() { return ho; }
    public void setHo(String ho) { this.ho = ho; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public int getSoSP() { return soSP; }
    public void setSoSP(int soSP) {
        this.soSP = (soSP < 0) ? 0 : soSP;
    }

  
    public double getLuong() {
        double donGia;
        if (soSP < 40) {
            donGia = 10000;
        } else if (soSP < 80) {
            donGia = 12000;
        } else {
            donGia = 15000;
        }
        return soSP * donGia;
    }

   
    public void hienThi() {
        System.out.println("Họ tên : " + ho + " " + ten);
        System.out.println("Số SP  : " + soSP);
       
        System.out.printf ("Lương  : %,.0f đồng%n", getLuong());
    }
}