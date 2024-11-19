/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherintance;

/**
 *
 * @author knmor
 */
public class BinatangTest {
    
    public static void main(String[] args) {
        Babi babi = new Babi("Betina", "Rome", 4);
        
        System.out.println("Sebelum nama Diset : " + babi.getNama());
        
        System.out.println("Mengganti nama babi");
        babi.setNama("Ken Foster Morintoh");
        babi.setJumlahKaki(4);
        System.out.println(babi.getNama());
        System.out.println("Jumlah Kaki :"+babi.getJumlahKaki());
        System.out.println();
        
        
        System.out.println("Kucing");
        Kucing k1 = new Kucing("Cowok", 10, "meow-mweo");
        
        System.out.println("Nama Kucing : " +k1.getNama());
        System.out.println("Jumlah Kaki : " +k1.getJumlahKaki());
        System.out.println("Suara : "+k1.getSuara());
        k1.setJumlahKaki(10);
        
    }
    
}
