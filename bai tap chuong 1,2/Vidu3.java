import java.util.Scanner;

public class Vidu3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a");
        int a=sc.nextInt();
        System.out.print("nhap b");
        int b=sc.nextInt();
        tong2so(a,b);
        hieu2so(a,b);
        tich2so(a,b);
    }

    private static void tich2so(int a, int b) {
        int tich = a*b;
        System.out.println("tich 2 so:" +tich);
    }

    private static void hieu2so(int a, int b) {
        int hieu = a-b;
        System.out.println("hieu 2 so:" +hieu);
    }

    private static void tong2so(int a, int b) {
        int tong = a+b;
        System.out.println("tong 2 so:" +tong);
    }
}
