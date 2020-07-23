/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Owner {
    private String name;
    private String ic_Number;
    
    public Owner(String name,String icNo){
        this.name = name;
        this.ic_Number = icNo;
    }
    
    public String toString(){
        return String.format("%-15s %-15s",name,ic_Number);
    }
}


