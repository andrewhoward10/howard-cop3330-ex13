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
        int numYears, afterYears;
        double principal, interest, acabou ;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principal = keyboardInput.nextDouble();

        System.out.print("Enter the rate of interest: ");
        interest = keyboardInput.nextDouble();

        System.out.print("Enter the number of years: ");
        numYears = keyboardInput.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        afterYears = keyboardInput.nextInt();

        acabou = principal * Math.pow((1 + interest/afterYears), (afterYears*numYears));

        System.out.print("$" + principal + " invested at " + interest + "% for " + numYears + " years compounded " + afterYears + " times per year is $" + String.format("%.2f", acabou) );
    }
}








