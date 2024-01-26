//Write a java program to print the below pattern

package tasksone;
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = obj.nextInt();
        obj.close();
        int temp = num;
        for (int i = num; i >= 1; i--) {
            temp = i;
            for (int j = num; j >= 1; j--) {
                if(i == temp) {
                    if(temp < j) {
                        System.out.print(j + " ");
                    }
                    else {
                        System.out.print(temp + " ");
                    }
                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }
}
//    Output :
//
//        Enter the Number :
//        5

//        5 5 5 5 5
//        5 4 4 4 4
//        5 4 3 3 3
//        5 4 3 2 2
//        5 4 3 2 1