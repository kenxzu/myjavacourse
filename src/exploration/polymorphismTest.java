/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author knmor
 */
public class polymorphismTest {
    public static void main(String[] args) {
        CommisionEmployee comissionEmployee = new CommisionEmployee("ken", "foster", "666-666-666", 10000, .06);
        
        BasePlusCommisionEmployee basePlusCommision = new BasePlusCommisionEmployee("Foster", "Moarintoh", "777-777-777", 20000, .04,300);
        
        
        
        System.out.printf("%s %s : %n%n%n%n", "tostring dari superclass",
                comissionEmployee.toString());
        System.out.printf("%s %s : %n%n%n%n", "tostring dari superclass",
                basePlusCommision.toString());
        
        
        //superclass dari kommision employee adalah baseplusCommision employee
        CommisionEmployee  commissionEmployee2 = basePlusCommision;
        
        System.out.printf("%s %s : %n%n%n%n", "tostring dari superclass",
                commissionEmployee2.toString());
        
        
        
        
        
        
    }
    
}
