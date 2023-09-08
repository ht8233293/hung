// Bài 1: Viết chương trình cho phép giải phương trình bậc
// nhất, trong đó các hệ số a và b nhập từ bàn phím.

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if (a != 0) {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
