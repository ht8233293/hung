// Viết chương trình nhập vào điểm 3 môn: toán,
// lý và hóa. Yêu cầu tính và xuất điểm trung bình theo
// công thức sau:
// ✓ Toán: hệ số 3
// ✓ Lý hệ số 2
// ✓ Hóa: hệ số 1
// ➢ Tức là Toán*3 + Lý*2 + Hóa sau đó chia cho 6.

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap điem mon Toan: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhap điem mon Ly: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhap điem mon Hoa: ");
        double diemHoa = scanner.nextDouble();
        
        double diemTrungBinh = (diemToan * 3 + diemLy * 2 + diemHoa) / 6;
        
        System.out.println("Điem trung binh: " + diemTrungBinh);
    }
}