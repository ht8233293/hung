// Bài toán mở rộng
// Viết chương trình tính thuế thu nhập. Giả sử thu
// nhập gồm lương và thưởng.
// Biết rằng: Thuế thu nhập được tính như sau
// Dưới 9 triệu: không đóng thuế
// Từ 9 đến 15 triệu: thuế 10%
// Từ 15 đến 30 triệu: 15%
// Trên 30 triệu: 20%

import java.util.Scanner;

public class Baitapmorong1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập lương và thưởng
        System.out.print("Nhập lương: ");
        double luong = scanner.nextDouble();
        
        System.out.print("Nhập thưởng: ");
        double thuong = scanner.nextDouble();
        
        // Tính tổng thu nhập
        double thuNhap = luong + thuong;
        
        // Tính thuế thu nhập dựa vào các mức thuế
        double thueThuNhap = 0;
        if (thuNhap <= 9000000) {
            thueThuNhap = 0;
        } else if (thuNhap <= 15000000) {
            thueThuNhap = thuNhap * 0.1;
        } else if (thuNhap <= 30000000) {
            thueThuNhap = thuNhap * 0.15;
        } else {
            thueThuNhap = thuNhap * 0.2;
        }
        
        // Xuất kết quả thuế thu nhập
        System.out.println("Thuế thu nhập: " + thueThuNhap + " đồng");
    }
}