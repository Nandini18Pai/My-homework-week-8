package Java_Homework_week4;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class RightAngleTriangle {
    public static void displayRightTriangle()
    {

        System.out.println( " Enter Right Angled Triangle Pattern Rows  : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println(" Printing Right Angled Triangle Patter of @");
        int i = 1,j;

        while (i<= rows)
        {
        j=1;
        while (j<=i)
        {
            System.out.print("@");
            j++;
        }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args)
    { displayRightTriangle();
    }
}





















