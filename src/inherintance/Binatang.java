/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author knmor
 */
public class Binatang {

    private String nama;
    private int jumlahKaki;

    public Binatang(String nama, int jumlahKaki) {
        this.nama = nama;
        if (jumlahKaki > 4) {
            System.out.println("Kaki binatang tidak lebih dari 4");
        } else {
            this.jumlahKaki = jumlahKaki;
        }

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        if (jumlahKaki > 4) {
            System.out.println("kelainan");
        } else {
            this.jumlahKaki = jumlahKaki;
        }
    }

}
