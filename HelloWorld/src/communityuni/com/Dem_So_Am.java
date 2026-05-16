package communityuni.com;
import java.util.*;
public class Dem_So_Am {
	static void NegativeNumberInStrings(String str) {
        // Regex: dấu '-' theo sau bởi ít nhất 1 chữ số
        // Đảm bảo '-' không phải ký tự '--' (dấu trừ đôi)
        Pattern p = Pattern.compile("(?<!-)-(\\d+)");
        Matcher m = p.matcher(str);

        boolean found = false;
        while (m.find()) {
            System.out.println("Số nguyên âm: -" + m.group(1));
            found = true;
        }
        if (!found)
            System.out.println("Không tìm thấy số nguyên âm.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập chuỗi: ");
	        String str = sc.nextLine();
	        NegativeNumberInStrings(str);
	}

}
