// Viết chương trình nhập từ bàn phím thông tin
// mua sản phẩm:
// ✓ Tên sản phẩm
// ✓ Đơn giá
// ✓ Số lượng
// ➢ Tính thuế nhập khẩu (10% giá trị) và xuất ra màn hình
// các thông tin sau:
// ✓ Tên sản phẩm
// ✓ Đơn giá
// ✓ Số lượng
// ✓ Thuế nhập khẩu

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        
        System.out.print("Nhap đon gia: ");
        double donGia = scanner.nextDouble();
        
        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();
        
        double thueNhapKhau = 0.1 * donGia * soLuong;
        
        System.out.println("Thong tin san pham:");
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Đon gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thue nhap khau: " + thueNhapKhau);
    }
}
