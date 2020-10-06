package outputgreatestvalue;

public class OutputGreatestValue {

    public static void main(String[] args) {
       int a=10 , b=23, c=5;
       int greatest = (a>b) ? (a>c?a:c) : (b>c?b:c);
       
       System.out.print("number 1 = " + a);
       System.out.print("number 2 = " + b);
       System.out.print("number 3 = " + c);
       System.out.print("The highest number is = " + greatest);
    }
}
