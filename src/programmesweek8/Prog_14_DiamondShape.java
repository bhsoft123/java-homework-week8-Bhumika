package programmesweek8;

import java.util.Scanner;

/*14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
PRIME TESTING
*****
***
**/
public class Prog_14_DiamondShape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();  // no of stars
        sc.close();
        int i;
        int j;
        int space;
                 //printing upper diamond               // space for printing space
        for ( i= 1; i<=n; i++ ) {                       // i for changing lines
            for (space = 1; space <= n-i ; space++ )
                {
                System.out.print("  ");
                }
                space = space-1;

            for (j = 1; j <= i * 2 -1; j ++)            // j for printing starts
                {
                System.out.print("* ");
                }
                System.out.println(" ");
            }

                //printing lower diamond
        for (i = n-1; i>=0 ; i--) {
             for (space = 1; space <= n - i; space++) //7, 6
                {
                System.out.print("  ");
                }
                space = space + 1;

             for (j = 1;  j <= i * 2-1; j++)
                {
                System.out.print("* ");
                }
                System.out.println(" ");
                }
    }}




