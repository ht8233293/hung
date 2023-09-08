import java.util.Scanner;

public class Bai3lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = 2.0;
        double b = -5.0;
        
        if (a != 0) {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
