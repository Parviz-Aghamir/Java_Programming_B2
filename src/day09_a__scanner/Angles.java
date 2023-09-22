  package day09_a__scanner;

  import java.util.Scanner;

  public class Angles {
    public static void main(String[] args) {

        /*Write a program that asks the user to enter 3 angle numbers ( can be floating numbers/decimal )
        Determine if the angles make a triangle, which means the angles add to 180.0
        and
        Determine if the angles make a circle, which means the angles add to 360.0

         */

        System.out.println("Enter three angle degree: ");
        Scanner input = new Scanner(System.in);
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();
        double total = angle1+angle2+angle3;
        boolean isTriangle = total ==180;
        boolean isCircle = total==360;
        System.out.println("It is a triangle: "+ isTriangle);
        System.out.println("It is a Circle: " + isCircle );


    }

}
