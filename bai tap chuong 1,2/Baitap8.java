// Bài 8: Viết chương trình nhập từ bàn phím số m. Xuất dãy số fibonaci các
// số nhỏ hơn m. Dãy fibonaci là dãy số có số sau bằng tổng 2 số đứng kế
// trước trong đó 2 số đầu tiên f0=1 và f1=2.

import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số m từ bàn phím
        System.out.print("Nhập số m: ");
        int m = scanner.nextInt();
        
        int f0 = 1;
        int f1 = 2;
        
        System.out.println("Dãy Fibonacci các số nhỏ hơn " + m + ":");
        System.out.print(f0 + " ");
        System.out.print(f1 + " ");
        
        int nextFibonacci = f0 + f1;
        while (nextFibonacci < m) {
            System.out.print(nextFibonacci + " ");
            f0 = f1;
            f1 = nextFibonacci;
            nextFibonacci = f0 + f1;
        }
    }
}