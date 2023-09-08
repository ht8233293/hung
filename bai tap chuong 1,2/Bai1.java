// Viết chương trình: Nhập các thông tin của 1 sinh
// viên gồm mã sinh viên, họ tên, tuổi, năm sinh, điểm trung
// bình. Xuất các thông tin ra màn hình (hãy sử dụng kiểu
// dữ liệu thích hợp).

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao MaSV:");
        String maSV = sc.nextLine();
        System.out.print("Nhap vao ho ten:");
        String hoTen = sc.nextLine();
        System.out.print("Nhap vao tuoi:");
        Short tuoi = sc.nextShort();
        System.out.print("Nhap vao nam sinh:");
        Short namSinh = sc.nextShort();
        System.out.print("Nhap vao diem trung binh:");
        float DTB = sc.nextFloat();
        System.out.println("<<======Thong tin nguoi dung=======>>");
        System.out.println("MaSV:" + maSV);
        System.out.println("hoTen:" + hoTen);
        System.out.println("Tuoi:" + tuoi);
        System.out.println("Nam sinh:" + namSinh);
        System.out.println("DTB:" + DTB);
    }

}