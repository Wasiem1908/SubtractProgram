package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a, b, sum; //Declaring three variables

        //INPUT

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number please: ");
        a = sc.nextInt();
        System.out.print("Enter the second number please: ");
        b = sc.nextInt();

        //PROCESSING2

        sum = a + b;

        //OUTPUT

        System.out.printf("%d + %d = %d\n", a, b, sum);
    }
}
