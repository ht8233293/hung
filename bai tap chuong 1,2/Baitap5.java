// Bài 5: Lập chương trình phân loại học sinh theo điểm sử
// dụng cấu trúc switch. Điểm nhập vào là các số nguyên từ
// 0 đến 10. Phân loại như sau:
// ▪ Điểm 0, 1, 2, 3: Xếp loại Kém
// ▪ Điểm 4: Loại Yếu
// ▪ Điểm 5, 6: Loại Trung bình
// ▪ Điểm 7, 8: Loại Khá
// ▪ Điểm 9, 10: Loại Giỏi

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập điểm từ 0 đến 10
        System.out.print("Nhập điểm học sinh (0-10): ");
        int diem = scanner.nextInt();
        
        // Phân loại học sinh dựa vào điểm
        String loaiHocSinh = "";
        switch (diem) {
            case 0:
            case 1:
            case 2:
            case 3:
                loaiHocSinh = "Kém";
                break;
            case 4:
                loaiHocSinh = "Yếu";
                break;
            case 5:
            case 6:
                loaiHocSinh = "Trung bình";
                break;
            case 7:
            case 8:
                loaiHocSinh = "Khá";
                break;
            case 9:
            case 10:
                loaiHocSinh = "Giỏi";
                break;
            default:
                System.out.println("Điểm không hợp lệ.");
                return;
        }
        
        System.out.println("Học sinh được phân loại là: " + loaiHocSinh);
    }
}