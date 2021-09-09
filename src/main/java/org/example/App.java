/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = scan.nextDouble();

        System.out.print("What is the rate? ");
        double rate = scan.nextDouble();

        System.out.print("What is the number of years? ");
        int years = scan.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int times_compounded = scan.nextInt();

        double rate_percentage = rate / 100;
        double amount1 = Math.pow((1 + (rate_percentage/times_compounded)), (times_compounded * years));
        double amount2 = amount1 * principal;
        double final_amount = Math.round(amount2 * 100.0) / 100.0;

        System.out.println("$" + principal + "invested at " + rate + "% for " + years + " years compounded " + times_compounded + " times per year is $" + final_amount);
    }
}
