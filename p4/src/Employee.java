/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Employee {
private String name;
private double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    
    public Employee(){
        name = " ";
        salary = 0.0;
    }
    
     public Employee(String employeeName){
        name = employeeName;
        salary = 0.0;
    }
    
    public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double amount) {
        salary = amount;
    }
    
    
    
    
}
