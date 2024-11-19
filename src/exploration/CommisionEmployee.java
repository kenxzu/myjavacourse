/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author knmor
 */ 
public class CommisionEmployee extends Object{
    /*keyword protected tidak bisa diakses oleh class yang bukan subtype dan class yang tidak berada di
    package yang sama */
    //ingat kenn protected member visible in class pada package yang sma
    /*protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double commisionRate;
    */
    
    //good software enginer using localizing  the effect of change 
    /*dlam artian yang paling simple mengakses variable instance private
    dengan method publicnya.
    */ 
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commisionRate;

    public CommisionEmployee (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
        if(grossSales <0.0)
            throw new IllegalArgumentException("Gross rate must be >= 0.0");
        
        if(grossSales <= 0.0 || commisionRate >= 1.0)
            throw new IllegalArgumentException("Commision rate must be > 0.0 and < 1.0");
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }
    
    public void setCommisionRate(double commisionRate){
        
        if (commisionRate <=0 || commisionRate >=1.0){
            throw new IllegalArgumentException("Commision rate must be > 0.0 and < 1.0");
        }
        this.commisionRate = commisionRate;
    }
    
  
    public double earnigs(){
        //return commisionRate * grossSales;
        return getCommisionRate() * getCommisionRate();
    }
        
    @Override
    public String  toString(){
        //ini yang menggunakan protected dan public 
        /*return String.format("%s : %s %s%n%s : %s%n%s: %.2f%n%s : %.2f",
                "commision employee", firstName, lastName, "Social Security Number", socialSecurityNumber,
                "gross sales", grossSales, "Commision Rate", commisionRate
                );*/
        
        //but this one how we suppose to do with the private membber
        return String.format("%n%s : %s %s%n%s : %s%n%s: %.2f%n%s : %.2f", 
                "commision employee", getFirstName(), getLastName(), 
                "Social Security Number", getSocialSecurityNumber(),
                "Gross sale", getGrossSales(), "Commision Rate", getCommisionRate());
    }
    
    
    
    
   
    
}
