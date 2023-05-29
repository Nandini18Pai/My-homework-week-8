package Java_Homework_week4;

/**
 *-Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */
import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public  void allNumbers(){

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        boolean empty = true;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();

                if (empty) {
                    min = temp;
                    max = temp;
                    empty = false;
                }
                if (min > temp) {
                    min = temp;
                }
                if (max < temp) {
                    max = temp;
                }
            } else {
                break;
            }
        }
        scanner.close();
        System.out.println("Min =" + min);
        System.out.println("Max =" + max);
    }
        public static void main(String[] args) {
            MinAndMaxInputChallenge obj1 = new MinAndMaxInputChallenge();
            obj1.allNumbers();

        }
}
