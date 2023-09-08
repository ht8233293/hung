// Viết chương trình thực hiện các công việc sau:
// ❑ Nhập liệu cho mảng có n phần tử nguyên (n > 0) từ
// bàn phím.
// ❑ Nhập số nguyên k từ bàn phím.
// ❑ Sắp xếp mảng tăng dần
// ❑ Tìm kiếm phần tử đầu tiên trong mảng có giá trị bằng k
// và thông báo lên màn hình vị trí của phần tử đó. Nếu
// không có phần tử nào của mảng có giá trị bằng k thì
// thông báo "Trong mảng không có phần tử nào chứa giá
// trị cần tìm."
//hung dep zai

import java.util.Scanner;

public class Bai3slide138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        // Nhập mảng từ bàn phím
        int[] mang = nhapMang(n, scanner);
        
        // Nhập số nguyên k từ bàn phím
        System.out.print("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        
        // Sắp xếp mảng tăng dần
        sapXepTangDan(mang);
        
        // Tìm và in vị trí của phần tử đầu tiên có giá trị bằng k
        int viTri = timViTriPhanTu(mang, k);
        if (viTri != -1) {
            System.out.println("Phần tử có giá trị " + k + " được tìm thấy tại vị trí " + viTri + " trong mảng.");
        } else {
            System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
        }
    }
    
    // Phương thức nhập mảng
    public static int[] nhapMang(int n, Scanner scanner) {
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        return mang;
    }
    
    // Phương thức sắp xếp mảng tăng dần
    public static void sapXepTangDan(int[] mang) {
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }
    
    // Phương thức tìm vị trí của phần tử đầu tiên có giá trị bằng k
    public static int timViTriPhanTu(int[] mang, int k) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
