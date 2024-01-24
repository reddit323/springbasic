/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author raulprudente
 */
public class Sobrecarga {

   
    public double calcula1(float a,float b){
        
        return a*b;
    }
    
    public String calcula(String a,String b){
        
        return a+b;
    }
    
    public static void main(String[] args) {
        Sobrecarga cal=new Sobrecarga();
      
        System.out.println(cal.calcula1(2,4));
        System.out.println(cal.calcula("deck","ard"));
    }
    
}
    
    

