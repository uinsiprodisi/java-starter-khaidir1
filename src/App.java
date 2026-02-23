import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan nim: ");
        // NIM sebaiknya menggunakan String, bukan int
        String nim = input.nextLine(); 
        
        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();
        
        System.out.print("Alasan Belajar Java: ");
        String alasan = input.nextLine();
        
        System.out.println("\n--- Hasil Output ---");
        System.out.println("Halo " + nama + ", dengan NIM " + nim + " dari program studi " + prodi + ".");
        System.out.println("Alasan kamu belajar: " + alasan);
        System.out.println("Selamat belajar JAVA!");

        input.close(); 
    }
}