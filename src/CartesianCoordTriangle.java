import java.util.Scanner;

/**
 * pseudocode
 1. Introduce arbitrary Cartesian coordinates, three vertex points A (x1, y1) B (x2, y2) C (x3, y3)
  2. Calculation of the formula (x1-x3) * (y2-y3) - (x2-x3) * (y1-y3) / 2 of the triangle
  3. Transfer to a positive number if the result is a negative number
  4. Make sure that this triangle:
  area of ​​a triangle in the Cartesian coordinates must be greater than zero. If zero, all three points are on a straight line
  5. Result display on the console.

 */

public class CartesianCoordTriangle {
    public static void main(String[] args) {
        int area;
        System.out.println("Lets input coordinates in A(x1,y1) B(x2,y2) C(x3,y3) format: ");

        System.out.print("Input x1: ");
        Scanner scan =new Scanner(System.in);
        int x1 =scan.nextInt();
        System.out.print("Input x2: ");
        Scanner scan2 =new Scanner(System.in);
        int x2 =scan2.nextInt();
        System.out.print("Input x3: ");
        Scanner scan3 =new Scanner(System.in);
        int x3 =scan3.nextInt();
        System.out.print("Input y1: ");
        Scanner scany1 =new Scanner(System.in);
        int y1 =scany1.nextInt();
        System.out.print("Input y2: ");
        Scanner scany2 =new Scanner(System.in);
        int y2 =scany2.nextInt();
        System.out.print("Input y3: ");
        Scanner scany3 =new Scanner(System.in);
        int y3 =scany3.nextInt();
        System.out.println("So A("+x1+","+y1+")  B("+x2+","+y2+") C("+x3+","+y3+")");
        area =((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2;
        area =(area<0 ? -area : area); //area must be a positive value
       if (area>0) System.out.println("Area of triangle " +area);//The area of the triangle in the Cartesian coordinate system must be greater than zero
       else System.out.println("Sorry it's not triangle but line");
    }


}
