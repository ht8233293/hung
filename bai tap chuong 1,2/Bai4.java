// Viết chương trình nhập các hệ số của phương trình bậc 2.
// Tính Delta và xuất căn delta ra màn hình.
// Hướng dẫn:
// + Delta=Math.pow(b,2)-4*a*c
// + Sử dụng Math.sqrt(delta) để tính căn delta


import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        double canDelta = Math.sqrt(delta);
        
        System.out.println("Can delta: " + canDelta);
    }
}
