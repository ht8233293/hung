// Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả
// số, ký tự thường và ký tự hoa từ bàn phím. Sau đó đếm và
// in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.
//hung dep zai

import java.util.Scanner;

public class Bai2slide137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi bất kỳ: ");
        String inputString = scanner.nextLine();
        
        // Đếm và in ra số ký tự thường, ký tự hoa và số có trong chuỗi
        int soKyTuThuong = demSoKyTuThuong(inputString);
        int soKyTuHoa = demSoKyTuHoa(inputString);
        int soSo = demSoSo(inputString);
        
        System.out.println("Số ký tự thường trong chuỗi: " + soKyTuThuong);
        System.out.println("Số ký tự hoa trong chuỗi: " + soKyTuHoa);
        System.out.println("Số số trong chuỗi: " + soSo);
    }
    
    // Phương thức đếm số ký tự thường trong chuỗi
    public static int demSoKyTuThuong(String chuoi) {
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isLowerCase(chuoi.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    // Phương thức đếm số ký tự hoa trong chuỗi
    public static int demSoKyTuHoa(String chuoi) {
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    
    // Phương thức đếm số trong chuỗi
    public static int demSoSo(String chuoi) {
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
