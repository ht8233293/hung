// Bài 4: Viết chương trình cho phép người dùng nhập vào 2 số
// nguyên a và b và một trong các phép toán gồm +, -, *, / (Chia lấy
// phần nguyên), % (chia lấy phần dư). Sau đó hiển thị kết quả tương
// ứng.

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        
        // Nhập phép toán
        System.out.print("Nhập phép toán (+, -, *, /, %): ");
        char phepToan = scanner.next().charAt(0);
        
        // Thực hiện phép toán và hiển thị kết quả
        int ketQua = 0;
        switch (phepToan) {
            case '+':
                ketQua = a + b;
                break;
            case '-':
                ketQua = a - b;
                break;
            case '*':
                ketQua = a * b;
                break;
            case '/':
                if (b != 0) {
                    ketQua = a / b;
                } else {
                    System.out.println("Không thể chia cho 0.");
                    return;
                }
                break;
            case '%':
                if (b != 0) {
                    ketQua = a % b;
                } else {
                    System.out.println("Không thể chia cho 0.");
                    return;
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                return;
        }
        
        System.out.println("Kết quả: " + ketQua);
    }
}
