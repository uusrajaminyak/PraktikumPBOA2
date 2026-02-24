/* Deskripsi    : berisi atribut dan method untuk objek Garis */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Selasa, 24 Februari 2026 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        System.out.println("Titik G1");
        G1.getTitikAwal();
        System.out.println("Set titik awal G1");
        G1.setTitikAwal(new Titik(2, 3));
        G1.printGaris();
        G1.getTitikAkhir();
        System.out.println("Set titik akhir G1");
        G1.setTitikAkhir(new Titik(5, 7));
        G1.printGaris();
        System.out.println("Titik G2");
        Garis G2 = new Garis(G1.getTitikAwal(), G1.getTitikAkhir());
        G2.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.println("Titik tengah ke G1: ");
        G1.getTitikTengah();
        System.out.println("Titik tengah ke G2: ");
        G2.getTitikTengah();
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
        System.out.println("Apakah G1 tegak lurus dengan G2: " + G1.isTegakLurus(G2));
        System.out.println("Apakah G1 sejajar dengan G2: " + G1.isSejajar(G2));
    }
}