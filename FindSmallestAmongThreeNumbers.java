Write a java program to find the smallest number among three numbers.

package tasksone;
import java.util.Scanner;
public class FindSmallestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int num1 = obj.nextInt();

        System.out.println("Enter the 2nd Number : ");
        int num2 = obj.nextInt();

        System.out.println("Enter the 3rd Number : ");
        int num3 = obj.nextInt();

        obj.close();

        int smallestNumber = Math.min(num1, Math.min(num2, num3));
        System.out.println("The Smallest number is : " + smallestNumber);

    }
}
//    Output :
//
//        Enter the 1st Number :
//        50
//        Enter the 2nd Number :
//        35
//        Enter the 3rd Number :
//        70
//        The Smallest number is : 35