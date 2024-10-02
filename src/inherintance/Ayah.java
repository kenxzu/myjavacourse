/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author knmor
 */
public class Ayah {
    private String nama = "Tomex";
    protected String marga = "Morintoh";
    
    
    public String getMarga(){
        return this.marga;
    }
    
    public String getNamaAyah()
    {
        return this.nama;
    }
    
    public void bentukHidung(){
        System.out.println("Mancung");
    }
    

    public void infoMarga(){
        System.out.println("Marga" +getMarga()+ "adalah marga dari sulawesi tengah");
    }
}
