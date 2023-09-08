// Bài 9: Viết chương trình liệt kê các số nguyên dương có 3 chữ số và có từ
// 20 ước số trở lên.

public class Baitap9 {
    public static void main(String[] args) {
        int min = 100; // Số nguyên dương nhỏ nhất có 3 chữ số
        int max = 999; // Số nguyên dương lớn nhất có 3 chữ số
        
        System.out.println("Các số nguyên dương có 3 chữ số và có từ 20 ước số trở lên:");
        for (int number = min; number <= max; number++) {
            int countDivisors = countDivisors(number);
            if (countDivisors >= 20) {
                System.out.println(number);
            }
        }
    }
    
    // Hàm đếm số lượng ước số của một số nguyên dương
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}