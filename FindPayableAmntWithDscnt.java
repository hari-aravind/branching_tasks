// Write a java program that takes the purchase amount as input and calculates the final payable amount after applying the discount

package tasksone;
import java.util.Scanner;
public class FindPayableAmntWithDscnt {
    public static void main(String[] args) {
        double purchaseAmnt, finalAmnt = 0, discount;
	Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Purchase Amount: ");
        purchaseAmnt = obj.nextFloat();
        
        if(purchaseAmnt <= 500)
        {
        	finalAmnt = purchaseAmnt;
        }
        else if(purchaseAmnt > 500 && purchaseAmnt <= 1000)
        {
           discount = (purchaseAmnt*10)/100;
           finalAmnt = purchaseAmnt - discount;
        }
        else if(purchaseAmnt > 1000)
        {
           discount = (purchaseAmnt*20)/100;
           finalAmnt = purchaseAmnt - discount;
        }
        System.out.println("\nThe Final Amount to be Paid After Appying Discount will be : " + finalAmnt);
    }
}

//        Output :
//
//        Enter the Purchase Amount :
//        1001

//        The Final Amount to be Paid After Appying Discount will be : 800.8