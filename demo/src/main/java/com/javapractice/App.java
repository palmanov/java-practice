package com.javapractice;

import java.util.Scanner;
import com.javapractice.Soda;

/**
 * Hello world!
 *
 */
public class App 
{
    private static void RunTask1()
    {
        //create the Scanner
        Scanner terminalInput = new Scanner(System.in);

        //read input
        String dopink = terminalInput.nextLine();

        Soda soda = new Soda(dopink);
        soda.showMyDrink();

        terminalInput.close();
    }

    private static void RunTask2()
    {
        //create the Scanner
        Scanner terminalInput = new Scanner(System.in);

        //read input
        String name = terminalInput.nextLine();
        int age = terminalInput.nextInt();

        Nikolay nikolay = new Nikolay(name, age);
        nikolay.printInfo();

        terminalInput.close();
    }

    public static void main( String[] args )
    {
        // RunTask1();
        RunTask2();
    }
}
