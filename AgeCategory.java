import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dan umur
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        // Menentukan kategori umur
        String kategori;
        if (umur < 5) {
            kategori = "balita";
        } else if (umur < 12) {
            kategori = "anak";
        } else if (umur < 18) {
            kategori = "remaja";
        } else if (umur < 40) {
            kategori = "dewasa";
        } else if (umur < 60) {
            kategori = "paruhbaya";
        } else {
            kategori = "lanjut usia";
        }

        // Menampilkan hasil
        System.out.println(nama + " berada dalam kategori " + kategori);
        
       
       
    }

    public static void tentukanKategori(String nama, int umur) {
        String kategori;
        if (umur < 5) {
            kategori = "balita";
        } else if (umur < 12) {
            kategori = "anak";
        } else if (umur < 18) {
            kategori = "remaja";
        } else if (umur < 40) {
            kategori = "dewasa";
        } else if (umur < 60) {
            kategori = "paruhbaya";
        } else {
            kategori = "lanjut usia";
        }
        System.out.println(nama + " berumur " + umur + " tahun, berada dalam kategori " + kategori);
    }
}