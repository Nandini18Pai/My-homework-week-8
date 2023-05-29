package Java_Homework_week4;

import java.util.Scanner;

/**
 *Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class LeftAngleTriangle {

    public void trianglePattern()
    {
            int i, j, my_input;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number of rows : ");
        my_input = scanner.nextInt();
        System.out.println(" The right triangle star pattern: ");
        for (i=0; i<my_input;i++){
            for(j=2*(my_input-i);j<=0;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
    LeftAngleTriangle obj = new LeftAngleTriangle();
    obj. trianglePattern();
    }

}
