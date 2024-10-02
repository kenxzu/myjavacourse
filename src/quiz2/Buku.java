/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author knmor
 */
class Buku extends Media {
    
    private String penulis;
    private int tahunRilis;
    private int jumlahHalaman;


    public Buku(String judul, String deskripsi, String penulis, int tahunRilis, int jumlahHalaman) {
        super(judul, deskripsi); // Memanggil constructor superclass Media
        this.penulis = penulis;
        this.tahunRilis = tahunRilis;
        this.jumlahHalaman = jumlahHalaman;
    }


    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    
    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Rilis: " + tahunRilis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}

