//Write down a program to reverse the given number using loops

package tasksone;
import java.util.Scanner;
public class ReverseOfNumbers{
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter a Number to Check : ");
        int num = obj.nextInt();
        obj.close();

        int reverseNumber = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            num /= 10;
        }

        System.out.println("The Reversed Number is : " + reverseNumber);

    }
}


//        Output :
//        Enter a Number to Check :
//        876
//        The Reversed Number is : 678