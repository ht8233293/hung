// Bài 3: Viết chương trình nhập vào số điện sử dụng của
// tháng và tính tiền điện theo phương pháp lũy tiến
// • Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là
// 1000
// • Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn
// mức là 1200.

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số điện sử dụng của tháng
        System.out.print("Nhập số điện sử dụng của tháng: ");
        double soDienSuDung = scanner.nextDouble();
        
        // Tính tiền điện theo phương pháp lũy tiến
        double giaDienCoBan = 1000;
        double giaDienVuotHanMuc = 1200;
        
        double tienDien = 0;
        if (soDienSuDung <= 50) {
            tienDien = soDienSuDung * giaDienCoBan;
        } else {
            double soDienVuotHanMuc = soDienSuDung - 50;
            tienDien = 50 * giaDienCoBan + soDienVuotHanMuc * giaDienVuotHanMuc;
        }
        // Xuất kết quả ra màn hình
        System.out.println("Số điện sử dụng: " + soDienSuDung + " kWh");
        System.out.println("Tiền điện cần thanh toán: " + tienDien + " đồng");
    }
}