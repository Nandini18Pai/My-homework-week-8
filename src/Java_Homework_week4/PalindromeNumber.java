package Java_Homework_week4;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        if (number < 1) {
            number = number * -1;
        }
        int lastDigit, reverse = 0, temp;

        temp = number;
        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }

         public static void main(String[] args) {
             System.out.println(isPalindrome(-1221));
             System.out.println(isPalindrome(707));
             System.out.println(isPalindrome(11212));

    }


}




