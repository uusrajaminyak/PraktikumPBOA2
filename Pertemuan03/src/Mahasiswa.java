/* Nama File    : Mahasiswa.java */
/* Deskripsi    : berisi atribut dan method untuk objek Mahasiswa */
/* Pembuat      : Yustinus Hendi Setyawan */
/* Tanggal      : Senin, 2 Maret 2026 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul() {
    return listMatkul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah matkul) {
        listMatkul.add(matkul);
    }

    public int getSKS() {
        int totalSks = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSks += matkul.getSKS();
        }
        return totalSks;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + dosenWali.getNama() + " (" + dosenWali.getNIP() + ")" + " Dari Prodi: " + dosenWali.getProdi());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " dengan No. Plat " + kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatkul) {
            System.out.println("- " + matkul.getNamaMatkul() + " (" + matkul.getSKS() + " SKS)");
        }
    }
}
