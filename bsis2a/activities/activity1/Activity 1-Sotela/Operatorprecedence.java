/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorprecedence;

/**
 *
 * @author evely
 */
public class Operatorprecedence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    System.out.print("a/b^c^d-e+f-g*h+1");
    System.out.print("\nRewritten: (a/b)^c^d-e+f-(g*h)+1");
    System.out.print("\n3*10*2/15-2+4^2^2");
    System.out.print("\nRewritten:((3*10)*2)/15)-(2+4)^2^2");
    System.out.print("\nr^s*t/u-v+w^x-y++");
    System.out.print("\nRewritten: r^((s*t)/u)-(v+w)^x-y++"+"\n");
        
    }
    
}
