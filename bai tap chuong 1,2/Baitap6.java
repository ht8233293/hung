// Bài 6: Viết chương trình nhập vào 2 số min và max từ bàn phím. Tính và
// xuất trung bình cộng các số chia hết cho 5 từ min đến max.

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số min và max từ bàn phím
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();
        
        // Tính trung bình cộng các số chia hết cho 5 từ min đến max
        int sum = 0;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        
        if (count > 0) {
            double trungBinhCong = (double) sum / count;
            System.out.println("Trung bình cộng các số chia hết cho 5 từ " + min + " đến " + max + " là " + trungBinhCong);
        } else {
            System.out.println("Không có số nào chia hết cho 5 trong khoảng từ " + min + " đến " + max);
        }
    }
}