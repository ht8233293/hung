// Viết chương trình nhập từ bàn phím bán
// đường kính của một đường tròn. Hãy tính và xuất
// diện tích và chu vi của đường tròn đó.
// Hướng dẫn:
// ✓ Chu vi = đường kính * 3.14
// ✓ Diện tích = 3.14 * bình phương của bán kính

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap đuong kinh cua đuong tron: ");
        double duongKinh = scanner.nextDouble();
        
        double chuVi = duongKinh * Math.PI;
        double banKinh = duongKinh / 2;
        double dienTich = Math.PI * Math.pow(banKinh, 2);
        
        System.out.println("Chu vi cua đuong tron: " + chuVi);
        System.out.println("Dien tich cua đuong tron: " + dienTich);
    }
}
