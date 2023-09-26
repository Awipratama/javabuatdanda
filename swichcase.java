import java.util.Scanner;

public class swichcase {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println(" Hallo Selamat Datang Di Kelompok PBO B3");
        System.out.println("=========================================");

        System.out.print("Masukkan Absen Anda (16, 20, 27, 29, 32) : ");
        int pilihan = scanner.nextInt();

        System.out.println();

        switch (pilihan) {
            case 16:
                System.out.println("Anda adalah Awi Pratama");
                break;
            case 20:
                System.out.println("Anda adalah Devara Cahya");
                break;
            case 27:
                System.out.println("Anda adalah Listya Pradnyani");
                break;
            case 29:
                System.out.println("Anda adalah Danda Oppa");
                break;
            case 32:
                System.out.println("Anda adalah Eliviana");
                break;
            default:
                System.out.println("Pilihan tidak valid Tolol");
        }
        // Menutup objek Scanner setelah penggunaan
        scanner.close();
    }
}
