
import java.util.Scanner;

// Class Pajak dengan enkapsulasi
class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getVendor() {
        return vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungPPN() {
        if (harga >= 4500000) {
            return harga * 0.05;
        } else if (harga >= 4200000 && harga < 4500000) {
            return harga * 0.02;
        } else if (harga == 4000000) {
            return harga * 0.01;
        } else {
            return harga * 0.005;
        }
    }

    public double hargaSetelahPPN() {
        return harga + hitungPPN();
    }
}

// Class Main dengan main method
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputan dari keyboard
        System.out.print("Masukkan nama vendor: ");
        String vendor = scanner.nextLine();
        System.out.print("Masukkan tipe smartphone: ");
        String tipe = scanner.nextLine();
        System.out.print("Masukkan harga smartphone: ");
        double harga = scanner.nextDouble();

        // Membuat objek Pajak dan menghitung harga setelah PPN
        Pajak pajak = new Pajak(vendor, tipe, harga);
        double hargaPPN = pajak.hargaSetelahPPN();

        // Menampilkan hasil
        System.out.println("Harga " + pajak.getVendor() + " " + pajak.getTipe() + " setelah ditambah PPN adalah: Rp" + hargaPPN);
    }
}