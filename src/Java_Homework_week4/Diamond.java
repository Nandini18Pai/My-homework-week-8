package Java_Homework_week4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Diamond {

    int i, j, r;

    public void diamondPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" inputs numbers of rows :  ");
        r = sc.nextInt();
        for (i = 0; i <= r; i++)
        {
            for (j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
            for (i=r-1; i>= 1; i--)
            {
                for (j=1;j<=r-i;j++)
                    System.out.print(" ");
                for (j = 1; j<= 2*i-1; j++)
                    System.out.print("*");
                    System.out.print("\n");


            }
        }


    public static void main(String[] args) {
        Diamond obj = new Diamond();
        obj.diamondPattern();
    }
}
