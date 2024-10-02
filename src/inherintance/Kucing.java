/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author knmor
 */
public class Kucing extends Binatang {
    private String suara;
    
    

    public Kucing(String nama, int jumlahKaki, String suara) {
        
        super(nama, jumlahKaki);
        this.suara = suara;
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
    
    public static void pukul()
    {
       System.out.println("rawwerrrrrr");
    }
    
    
    
    
    
}
