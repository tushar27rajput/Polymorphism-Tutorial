/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopoly;

/**
 *
 * @author tusshar
 */
public class DemoPoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DemoPoly obj1= new DemoPoly();
        obj1.sum(99, 1);
        obj1.sum(1, 1, 998);
    }
    
    public void sum(int a ,int b)
    {
        int c = a+b;
        System.out.println("Sum is : "+c);
    }
    public void sum(int a,int b,int d)
    {
         d=a+b+d;
        System.out.println("Sum is :"+d);
    }
    
}
