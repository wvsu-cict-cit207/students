package Packs;

public class Act1OperatorPrecedence {
   public static void main(String[] args){

       System.out.print("a / b ^ c ^ d – e + f – g * h + i"+"\n");
       System.out.print("3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2"+"\n");
       System.out.print("r ^ s * t / u – v + w ^ x – y++"+"\n");
       System.out.print("Re-write output with parenthesis: "+"\n \n");
       System.out.print("(a / b) ^ c ^ d – e + f – (g * h) + i"+"\n");
       System.out.print("{[(3 * 10) *2] / 15} – (2 + 4) ^ 2 ^ 2"+"\n");
       System.out.print("r ^ [(s * t) / u] – (v + w) ^ x – y++"+"\n");


   }


}
