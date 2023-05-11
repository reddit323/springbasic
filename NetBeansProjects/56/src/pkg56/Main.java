/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg56;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int total=0;
       int gradecounter=0;
       int aacount=0;
       int bacount=0;
       int cacount=0;
       int dacount=0;
       int eacount=0;
      
       Scanner input=new Scanner(System.in);
       
       System.out.printf("%s%n%s%n %s%n  %s%n",
               "enter the integer number in range of 0 to 100: ",
                "Type the end-of-file indicator to terminate input:",
"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
 "On Windows type <Ctrl> z then press Enter");

       
       while(input.hasNext())
       {
           int grade=input.nextInt();
           total+=grade;
           ++gradecounter;
           
       
       switch (grade/10)
       {
           case 9:
            case 10:
               ++aacount;
               break;
            case  8:
                ++bacount;
                break;
                
            case 7:
                ++cacount;
                break;
                
            case 6:
                ++dacount;
                break;
                
            default:
                ++eacount;
                break;
                
            
           
               
       }


       }
       
System.out.printf("%n gradecounter:%n");

if(gradecounter!=0){
    
  double average=(double)total/gradecounter;

  System.out.printf("Total of the %d grades entered is %d%n", gradecounter, total);
 System.out.printf("Class average is %.2f%n", average);
 System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
 "Number of students who received each grade: ",
 "A: ", aacount,
 "B: ", bacount,
 "C: ", cacount,
 "D: ", dacount,
 "F: ", eacount); 
}
 else 
 System.out.println("No grades were entered");


    }
    
}