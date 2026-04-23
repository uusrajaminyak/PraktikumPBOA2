/* Nama File    : PolimorfismeCoercion.java */
/* Deskripsi    : Realisasi Polimorfisme Ad Hoc Coercion */
/* Pembuat      : Yustinus Hendi Setyawan - 24060124130114 */
/* Tanggal      : Senin, 20 April 2026 */

public class PolimorfismeCoercion {
    public static void main(String[] args) {

        // a
        System.out.println("a.");
        int nilai = 65;
        System.out.println("integer : " + nilai);
        System.out.println("karakter: " + (char) nilai);
        System.out.println("real: " + (double) nilai);

        // b.
        System.out.println("\nb.");
        int nilaiAwal = 100;
        double nilaiReal = (double) nilaiAwal;
        int nilaiBaru = (int) nilaiReal;

        System.out.println("Nilai awal: " + nilaiAwal);
        System.out.println("Ubah ke real: " + nilaiReal);
        System.out.println("Ubah ke awal: " + nilaiBaru);

        // c
        System.out.println("\nc.");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); 

        System.out.println("Objek S: " + S);
        System.out.println("Objek Z: " + Z);

        // d
        System.out.println("\nd.");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; 
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("Objek R: " + R);
        System.out.println("Objek D: " + D);

        // e
        System.out.println("\ne.");
        Integer A = Integer.parseInt(S);
        System.out.println("Objek A: " + A);

        // f
        System.out.println("\nf.");
        String T = A.toString();
        System.out.println("Objek T: " + T);
    }
}