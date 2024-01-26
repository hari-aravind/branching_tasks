//Write a java program that find a given number is positve or negative

package tasksone;
import java.util.Scanner;
public class CheckPostiveorNegative{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n = obj.nextInt();
        obj.close();

        if(n > 0) {
            System.out.println("Number you have entered is a positive number");
        } else if (n == 0) {
            System.out.println("Zero is neither positive nor negative");
        } else {
            System.out.println("Number you have entered is a negative number");
        }
    }
}

//        Output :
//            Enter a number to check :
//            36
//            Number you have entered is a positive number
//
