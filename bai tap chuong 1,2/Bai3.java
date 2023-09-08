// Viết chương trình nhập từ bàn phím 2 cạnh cuả hình chữ
// nhật. Tính và xuất chu vi, diện tích và cạnh nhỏ nhất của hình chữ
// nhật.
// Hướng dẫn:
// + Chu vi = (dai+rong)*2
// + Dientich=Dai*rong
// + Canhhonhat=Math.min(dai,rong)

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chieu dai của hinh chu nhat: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double rong = scanner.nextDouble();
        
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);
        
        System.out.println("Chu vi của hinh chu nhat : " + chuVi);
        System.out.println("dien tich hinh chu nhat: " + dienTich);
        System.out.println("canh nho nhat cua hinh chu nhat: " + canhNhoNhat);
    }
}

