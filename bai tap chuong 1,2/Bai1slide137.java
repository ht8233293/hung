// Viết chương trình nhập từ bàn phím một chuỗi
// không quá 80 ký tự và một ký tự bất kỳ.
// ▪ Đếm và in ra màn hình số lần xuất hiện của ký tự đó
// trong chuỗi vừa nhập.
// ▪ Chuyển đổi chuỗi thành chữ in hoa (Viết hoa chữ cái
// đầu tiên của từ).
//hùng đẹp zai

import java.util.Scanner;

public class Bai1slide137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chuỗi và ký tự từ bàn phím
        System.out.print("Nhập chuỗi không quá 80 ký tự: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Nhập ký tự bất kỳ: ");
        char character = scanner.next().charAt(0);
        
        // Đếm và in số lần xuất hiện của ký tự trong chuỗi
        int count = demSoLanXuatHien(inputString, character);
        System.out.println("Số lần xuất hiện của ký tự " + character + " trong chuỗi: " + count);
        
        // Chuyển đổi chuỗi thành chữ in hoa
        String chuoiVietHoa = chuyenChuoiVietHoa(inputString);
        System.out.println("Chuỗi sau khi chuyển đổi thành chữ in hoa: " + chuoiVietHoa);
    }
    
    // Phương thức đếm số lần xuất hiện của ký tự trong chuỗi
    public static int demSoLanXuatHien(String chuoi, char kyTu) {
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        return count;
    }
    
    // Phương thức chuyển đổi chuỗi thành chữ in hoa
    public static String chuyenChuoiVietHoa(String chuoi) {
        StringBuilder result = new StringBuilder();
        boolean needUpper = true;
        
        for (char c : chuoi.toCharArray()) {
            if (Character.isWhitespace(c)) {
                needUpper = true;
            } else if (needUpper) {
                c = Character.toUpperCase(c);
                needUpper = false;
            } else {
                c = Character.toLowerCase(c);
            }
            
            result.append(c);
        }
        
        return result.toString();
    }
}

