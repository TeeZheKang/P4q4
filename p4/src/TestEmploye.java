/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestEmploye {
    public static void main(String [] args){
        Employee emp1 = new Employee("Xiao Ming", 5000.00);
        Employee emp2 = new Employee("Xiao Hua");
        emp2.setSalary(4600.00);
        
        System.out.println("Salary : " + emp1.getSalary());
        
        emp1.raiseSalary(8.0);
        
        System.out.println("Salary : " + emp1.getSalary());
        
        if(emp1.getSalary()>emp2.getSalary()){
            System.out.println(emp1.getName() + " "+ emp1.getSalary());
        }
        else{
            System.out.println(emp2.getName() + " "+ emp2.getSalary());
        }
        
        System.out.println("Total : " + (emp1.getSalary() + emp2.getSalary()));
    }
}
