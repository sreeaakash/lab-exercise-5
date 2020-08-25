/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class student
{
    String name;
    int rollno;
    
    
}
class mark extends student
    {
         int m1,m2,m3;
         double average;
         void get()
    {
         System.out.println("Enter the student's name:");    
         Scanner obj=new Scanner (System.in);
         name=obj.next();
         System.out.println("Enter the student's roll number:");  
         rollno=obj.nextInt();
        System.out.println("Enter the marks:");
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
        
    }
    double  display()
    {
         System.out.println("The student's name is:"+name);
         System.out.println("The student's roll no is:"+rollno);
         System.out.println("The marks are:"+m1);
         System.out.println(+m2);
         System.out.println(+m3);
         average=(m1+m2+m3)/3;
         
         return average;
    }
         
    }
 class results extends student
    {
        
        void  calculateavg(double average)
        {
      
           if(average>90 && average<=100)
           {
                
           }
           else  if(average>80 && average<=90)
           {
               System.out.println("The grade is B"); 
           }
           else  if(average>=70 && average<=80)
           {
               System.out.println("The grade is C"); 
           }
           
           else if(average>=60 && average<70)
           {
               System.out.println("The grade is D"); 
           }
          
           else 
           {
               System.out.println("The grade is E"); 
           }
       }
 }           
        
        
        
    

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mark obj=new mark();
        obj.get();
        obj.display();
        System.out.println("The average mark is:"+obj.average);
        results obj1=new results();
        obj1.calculateavg( obj.average);
        
        
    }
    
}
