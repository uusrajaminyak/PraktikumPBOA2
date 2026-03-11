/* Nama File    : Main.java */
/* Deskripsi    : berisi realisasi dari atribut dan method */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 9 Maret 2026 */


public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5.0, "Merah", "Solid");
        Persegi persegi2 = new Persegi(7.0, "Hijau", "Dotted");
        Lingkaran lingkaran1 = new Lingkaran(3.0, "Biru", "Dashed");
        Lingkaran lingkaran2 = new Lingkaran(4.0, "Kuning", "Solid");

        System.out.println("Informasi Persegi 1:");
        persegi1.printInfo();
        System.out.println("Luas Persegi: " + persegi1.getLuas());
        System.out.println("Keliling Persegi: " + persegi1.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi1.getDiagonal());

        System.out.println("\nInformasi Persegi 2:");
        persegi2.printInfo();
        System.out.println("Luas Persegi: " + persegi2.getLuas());
        System.out.println("Keliling Persegi: " + persegi2.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi2.getDiagonal());

        System.out.println("\nInformasi Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());

        System.out.println("\nInformasi Lingkaran 2:");
        lingkaran2.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran2.getKeliling());

        System.out.println("\nTotal Bangun Datar yang dibuat: " + BangunDatar.counterBangunDatar);
    }
}