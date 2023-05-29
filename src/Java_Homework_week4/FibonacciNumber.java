package Java_Homework_week4;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 *
 */
public class FibonacciNumber {

      public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        obj.sequence();

    }

        public void sequence(){
        int n = 10, firstTerm=0, secondTerm = 1;
            System.out.println("Fibonacci Series till" + n + " terms:");
            for (int i =1;i<n;++i){
                System.out.println(firstTerm + ",");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;

            }

    }
}
