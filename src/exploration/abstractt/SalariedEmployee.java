/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration.abstractt;

/**
 *
 * @author knmor
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0 )
            throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    @Override 
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s : $%,.2f","weekly salary",super.toString(), getWeeklySalary());
    }
    
    
    
}
