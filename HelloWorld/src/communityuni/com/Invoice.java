package communityuni.com;

public class Invoice {

    
    private String maMatHang;
    private String moTaMatHang;
    private int soLuong;
    private double giaMoiMatHang;

    
    public Invoice(String maMatHang, String moTaMatHang, int soLuong, double giaMoiMatHang) {
        this.maMatHang = maMatHang;
        this.moTaMatHang = moTaMatHang;

       
        if (soLuong > 0) {
            this.soLuong = soLuong;
        } else {
            this.soLuong = 0;
        }

       
        if (giaMoiMatHang > 0) {
            this.giaMoiMatHang = giaMoiMatHang;
        } else {
            this.giaMoiMatHang = 0.0;
        }
    }

    // Getter và Setter
    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getMoTaMatHang() {
        return moTaMatHang;
    }

    public void setMoTaMatHang(String moTaMatHang) {
        this.moTaMatHang = moTaMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong > 0) {
            this.soLuong = soLuong;
        } else {
            this.soLuong = 0;
        }
    }

    public double getGiaMoiMatHang() {
        return giaMoiMatHang;
    }

    public void setGiaMoiMatHang(double giaMoiMatHang) {
        if (giaMoiMatHang > 0) {
            this.giaMoiMatHang = giaMoiMatHang;
        } else {
            this.giaMoiMatHang = 0.0;
        }
    }

   
    public double getInvoiceAmount() {
        return soLuong * giaMoiMatHang;
    }

    public static void main(String[] args) {
        try {
            System.out.println("--- Bắt đầu chương trình ---");
            
            
            Invoice hd = new Invoice("MH01", "Chuột Gaming", 2, 350000);

            
            System.out.println("Mã mặt hàng: " + hd.getMaMatHang());
            System.out.println("Mô tả: " + hd.getMoTaMatHang());
            System.out.println("Số lượng: " + hd.getSoLuong());
            System.out.println("Giá mỗi mặt hàng: " + hd.getGiaMoiMatHang());

            System.out.println("Tổng tiền hóa đơn: " + hd.getInvoiceAmount());
            
        } catch (NullPointerException e) {
            System.err.println("Lỗi: Đối tượng hóa đơn bị null!");
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi hệ thống: " + e.getMessage());
        } finally {
           
            System.out.println("--- Kết thúc chương trình (Giải phóng tài nguyên nếu có) ---");
        }
    }
} 