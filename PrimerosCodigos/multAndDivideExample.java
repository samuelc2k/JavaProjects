
package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {
            double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + (subtotal*tax);
    double perPerson = total/4;
    
    System.out.println(total);
    System.out.println(perPerson);
    
    }
    
}
