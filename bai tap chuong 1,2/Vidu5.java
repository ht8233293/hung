import java.util.Scanner;

public class Vidu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a,n);
        xuat(a,n);
        sapxep(a,n);
        xuat(a,n);
    }

    private static void sapxep(int[] a, int n) {
        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length-1;j++){
                if(a[i] > a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }

    }

    private static void xuat(int[] a, int n) {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]  + " ");
        System.out.println("\n");
    }

    private static void nhap(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao mang");
        for(int i=0;i<a.length;i++)
        a[i] = sc.nextInt();
    }
}
