/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author knmor
 */
import javax.swing.JOptionPane;
public class Dialog1 {
    public static void main(String[] args) {
    //dialog simple
        JOptionPane.showMessageDialog(null, "welcome to java gui ken foster morintoh");
    // dialog name 
    String name = JOptionPane.showInputDialog("what is your name brother ?");
    String message = String.format("Welcome %s to java programming ", name);
    JOptionPane.showMessageDialog(null, message);
    
    JOptionPane.showConfirmDialog(null, "okee?");
    }
    
    
}
