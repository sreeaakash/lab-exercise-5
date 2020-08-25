/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author Admin
 */
class degree
{
   void getdegree()
    {
        System.out.println("I got a degree");
    }
}
class undergraduate extends degree
{
    void getdegree()
    {
        System.out.println("I am an undergraduate");
    }
}
class postgraduate extends degree
{
    void getdegree()
    {
        System.out.println("I am a postgraduate");
    }
}
public class Inheritance1 {
     public static void main(String[] args) {
  
        System.out.println("Calling degree function using 3 objects");
         degree obj=new degree();
         
         undergraduate obj2=new undergraduate();
         postgraduate obj3=new postgraduate();
         obj.getdegree();
         System.out.println("Calling degree using undergraduate subclass");
         obj2.getdegree();
         System.out.println("Calling degree using postgraduate subclass");
         obj3.getdegree();
     }
}
