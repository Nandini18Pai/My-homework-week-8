package Java_Homework_week4;
import java.util.Scanner;
/**
 *Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {
    public void armstrongNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number ");
        int num = sc.nextInt(), originalNumber, remainder,result=0;
        originalNumber = num;
        while(originalNumber!= 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder,3);
            originalNumber/= 10;
        }
        if(result==num)
            System.out.println(num + " is a an ArmstrongNumber");
            else System.out.println(num + " is not an ArmstrongNumber");
    }
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.armstrongNumber();
    }

}
