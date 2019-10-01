
import java.util.Scanner;

class MortgageCalc {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = 0;  
        double r = 0;   
        double n = 0;   
        double i = 0;  
        
     
        System.out.println("Mortgage Calculator");
        System.out.println("--------------------");
        System.out.println("");
        System.out.print(" principle amount: ");
        p = sc.nextDouble();
        System.out.print("interest rate: ");
        r = sc.nextDouble();
        System.out.print("number of years: ");
        n = sc.nextDouble();

        i = p * Math.pow(1+r,n);
        System.out.println("This investment will be worth $" + i + " after " + n + " years.");
    }
}