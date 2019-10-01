
import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2 = 0;
        double dist = 0;
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.println("");
        System.out.print("Enter the first x coord: ");
        x1 = sc.nextDouble();
        System.out.print("Enter the first y coord: ");
        y1 = sc.nextDouble();
        System.out.print("Enter the last x coord: ");
        x2 = sc.nextDouble();
        System.out.print("Enter the last y coord: ");
        y2 = sc.nextDouble();
        dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("The distance is " + dist );
    }

}