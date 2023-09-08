// Bài 7: Viết chương trình nhập một số nguyên từ bàn phím và cho biết số
// đó có phải là số nguyên tố hay không (số nguyên tố là số chỉ chia hết cho
// 1 và chính nó).

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        
        // Kiểm tra xem số có phải là số nguyên tố hay không
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Xuất kết quả
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không là số nguyên tố.");
        }
    }
}
