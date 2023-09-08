import java.util.Scanner;

public class Bai2kt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap xau ho ten: ");
        String hoTen = scanner.nextLine();
        
        String hoTenChuanHoa = chuanHoaHoTen(hoTen);
        System.out.println(" xau ho ten sau khi chuan hoa:" + hoTenChuanHoa);
        
        int soLuongTu = demSoLuongTu(hoTen);
        System.out.println("So luong tu trong xau: " + soLuongTu);
        
        int viTriTuMax = timViTriTuMax(hoTen);
        System.out.println("Vi tri cua tu co do dai lon nhat trong xau: " + viTriTuMax);
    }
    
    public static String chuanHoaHoTen(String hoTen) {
        hoTen = hoTen.trim().toLowerCase();
        String[] words = hoTen.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1)).append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
    public static int demSoLuongTu(String hoTen) {
        String[] words = hoTen.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
    
    public static int timViTriTuMax(String hoTen) {
        String[] words = hoTen.split("\\s+");
        int viTriTuMax = -1;
        int doDaiMax = -1;
        
        for (int i = 0; i < words.length; i++) {
            int doDaiTu = words[i].length();
            if (doDaiTu > doDaiMax) {
                doDaiMax = doDaiTu;
                viTriTuMax = i+1;
            }
        }
        
        return viTriTuMax;
    }
}
