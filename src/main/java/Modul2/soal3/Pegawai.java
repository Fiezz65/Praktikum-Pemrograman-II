package Modul2.soal3;

public class Pegawai {
    public String nama;
    //Pada baris ini terjadi error karena tipe data asal seharusnya String ("Kingdom of Orvel" adalah String)
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
    //Pada baris ini terjadi error karena variabel j tidak dideklarasikan, dan method ini tidak menerima parameter
    //public void setJabatan() {
    //    this.jabatan = j;
    //}
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}