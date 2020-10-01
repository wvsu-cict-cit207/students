
package activity.pkg3;


public class Activity3 {


    public static void main(String[] args) {
          int n1 = 10,
            n2 = 23,
            n3 = 5;
        
        int max = (n1 > n2 ? n1 : n2 > n3 ? (n1 > n2 ? n1 : n2) : n3);
                
System.out.println("Number 1 is " + n1);
System.out.println("Number 2 is " + n2);
System.out.println("Number 3 is " + n3);  
System.out.println("The highest number is " + max);   

    }
    
}
