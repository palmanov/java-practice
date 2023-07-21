package com.javapractice;

import java.util.Scanner;

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

    private static void RunTask3()
    {
        Scanner in = new Scanner(System.in);
        String[] data = in.nextLine().split(" ");
        int[] vertex = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            vertex[i] = Integer.parseInt(data[i]);
        }

        TriangleChecker triangle_checker = new TriangleChecker(vertex);
        triangle_checker.isTriangle();

        in.close();
    }

    public static void main( String[] args )
    {
        // RunTask1();
        // RunTask2();
        RunTask3();
    }
}
