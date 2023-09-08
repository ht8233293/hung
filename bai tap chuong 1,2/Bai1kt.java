import java.util.Scanner;

public class Bai1kt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        5
        System.out.print("nhap vao phan tu cua mang ");
        int n = scanner.nextInt();
        
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        
        System.out.println("Cac gia tri cua mang:");
        inMang(mang);
        
        int min = timMin(mang);
        int max = timMax(mang);
        System.out.println("gia tri  min: " + min);
        System.out.println("gia tri max: " + max);
        
        int tongSoNguyenTo = demVaInSoNguyenTo(mang);
        System.out.println("tong cua cac nguyen to trong mang: " + tongSoNguyenTo);
        
        sapXepTangDan(mang);
        System.out.println("mang sau khi sap xep tang dan:");
        inMang(mang);
        
        System.out.print("nhap gia tri x: ");
        int x = scanner.nextInt();
        kiemTraVaInViTri(x, mang);
    }
    
    public static void inMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static int timMin(int[] mang) {
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }
    
    public static int timMax(int[] mang) {
        int max = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }
    
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int demVaInSoNguyenTo(int[] mang) {
        int tongSoNguyenTo = 0;
        for (int i = 0; i < mang.length; i++) {
            if (laSoNguyenTo(mang[i])) {
                tongSoNguyenTo += mang[i];
                int[] arr = new int[mang.length];
                System.out.print(mang[i]+" ");
                System.out.println("So nguyen to la " + mang[i] + ": " + mang[i]);
            }
        }
        return tongSoNguyenTo;
    }

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
    
    public static void kiemTraVaInViTri(int x, int[] mang) {
        boolean timThay = false;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                System.out.println("phan tu " + x + " duoc tim thay tai vi tri " + (i+1) + " trong mang.");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Trong mamg khong co phan tu nao chua gia tri" + x + ".");
        }
    }
}
