package zukhrufi.resepmakanan;

/**
 * Created by ERWINDA on 03/10/2017.
 */

public class Resep {
    private String Judul, Keterangan, Pembuatan;
    int Gambar;
    public Resep(String s, int bakwanjagung, String mantap){

    }
    public Resep(String judul, int gambar, String keterangan, String pembuatan){
        this.Judul = judul;
        this.Keterangan = keterangan;
        this.Gambar = gambar;
        this.Pembuatan = pembuatan;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        this.Judul = judul;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }

    public int getGambar() {
        return Gambar;
    }

    public void setGambar(int gambar) {
        Gambar = gambar;
    }

    public String getPembuatan() {
        return Pembuatan;
    }

    public void setPembuatan(String pembuatan) {
        Pembuatan = pembuatan;
    }
}
