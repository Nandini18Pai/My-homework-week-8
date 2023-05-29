package Java_Homework_week4;

import java.util.Scanner;

/**
 *1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 *
 *
 */


public class ReadingUserInputChallenge
{

    int invNos[] = new int[10];
    int sum = 0, num;
    Scanner scanner = new Scanner(System.in);
    public boolean hasNextInt(int num) {
        if (num > 10) {
            System.out.println(" Invalid number");
            return false;
        } else {
            System.out.println(" Enter number # ");

            num = scanner.nextInt();
        }
        this.num = num;
        return true;
    }
        public void nextInt()
        {
        int i = 1;
        while(i<=num)
        {
            System.out.println(" Enter number # " + i+" ");
             invNos[i]=scanner.nextInt();
            sum = sum + invNos[i];
            i++;
        }
            System.out.println(" Sum of Number Are : " + sum);
            scanner.close();
        }
    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.hasNextInt(10);
        obj.nextInt();

    }
    }