
import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
  
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double a = 0;
     
        System.out.println("Circle Area Calculator");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Enter the circle's radius: ");
        r = sc.nextDouble();
        
        
        a = Math.PI * r * r;
        System.out.println("The area is " + a );
    }
}
