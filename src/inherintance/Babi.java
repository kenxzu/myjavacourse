/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author knmor
 */
public class Babi extends Binatang{
    
    private String jenis;

    public Babi(String jenis, String nama, int jumlahKaki) {
        super(nama, jumlahKaki);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
  
    
}
