import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5.");
        } else if (angka == 5) {
            System.out.println("Angkany Sesuai Harapan Kami 5.");
        } else {
            System.out.println("Kurang Njir");
        }
        scanner.close();
    }
}
