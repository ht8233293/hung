// Viết chương trình: Nhập vào hai số nguyên x, y.
// Xuất ra màn hình tổng, hiệu, tích, thương, phần dư của x
// chia y, của hai số trên.

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen x: ");
        int x = scanner.nextInt();
        
        System.out.print("Nhap so nguyen y: ");
        int y = scanner.nextInt();
        
        int tong = x + y;
        int hieu = x - y;
        int tich = x * y;
        float thuong = (float) x / y; 
        int phanDu = x % y;
        
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phan du: " + phanDu);
    }
}
