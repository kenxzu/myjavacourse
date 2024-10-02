/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author knmor
 */

class Video extends Media {

    private String pembuat;
    private int durasi; // durasi dalam menit
    private String tanggalBuat;

    public Video(String judul, String deskripsi, String pembuat, int durasi, String tanggalBuat) {
        super(judul, deskripsi); // Memanggil constructor superclass Media
        this.pembuat = pembuat;
        this.durasi = durasi;
        this.tanggalBuat = tanggalBuat;
    }

 
    public String getPembuat() {
        return pembuat;
    }

    public void setPembuat(String pembuat) {
        this.pembuat = pembuat;
    }

    
    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

 
    public String getTanggalBuat() {
        return tanggalBuat;
    }

    public void setTanggalBuat(String tanggalBuat) {
        this.tanggalBuat = tanggalBuat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pembuat: " + pembuat);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Tanggal Buat: " + tanggalBuat);
    }
}