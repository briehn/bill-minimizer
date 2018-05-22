package BillMinimizer;

import java.util.Scanner;
/**
 * Provides least amount of bills required for a given amount.
 * @author Brian Yu
 * @version 1.0
 */
public class BillMinimizer{
  /**
   * Reads a given value entered via keyboard and gives least amount of bills required.
   * @param args A reference to a string array containing command-line arguments
   */
  public static void main(String[] args){
        double originalAmount;
        int amountInPennies, remainBalance, tenDollar, fiveDollar, oneDollar, quarter, dime, nickel, penny;

        Scanner scan = new Scanner(System.in);
      
        //Input
        //	Read a value entered via keyboard.
        System.out.print ("Enter a monetary amount: ");
        originalAmount = scan.nextDouble();

        //Processing
        //  Multiple given value (originalAmount) by 100 to get the amount in pennies (amountInPennies).
        //  Modulo remaining balance (remainBalance) by the bill/coin value to get the remainder (remainBalance).
        //  Divide remaining balance (remainBalance) by the bill/coin value to get the amount of bills/coins (respective to current bill/coin).
        //  Repeat until you reach pennies, the remaining balance (remainBalance) is how many pennies are left.
        amountInPennies = (int) (originalAmount * 100.0);
        // $10: There are 1000 pennies in a $10 bill.
        tenDollar = amountInPennies / 1000;
        remainBalance = amountInPennies % 1000;
        // $5: There are 500 pennies in a $5 bill.
        fiveDollar = remainBalance / 500;
        remainBalance = remainBalance % 500;
        // $1: There are 100 pennies in a $1 bill.
        oneDollar = remainBalance / 100;
        remainBalance= remainBalance % 100;
        // Quarters: There are 25 pennies in a quarter.
        quarter = remainBalance / 25;
        remainBalance = remainBalance % 25;
        // Dimes: There are 10 pennies in a dime.
        dime = remainBalance / 10;
        remainBalance = remainBalance % 10;
        // Nickels: There are 5 pennies in a nickel.
        nickel = remainBalance / 5;
        remainBalance = remainBalance % 5;
        // Pennies: There is 1 penny in a penny. :)
        penny = remainBalance;

        //Output
        //	Display the least amount of bills for the given value.
        System.out.println("That's equivalent to: ");
        System.out.println(tenDollar + " ten dollar bills");
        System.out.println(fiveDollar + " five dollar bills");
        System.out.println(oneDollar + " one dollar bills");
        System.out.println(quarter + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(penny + " pennies");
        scan.close();
      }
}
  
