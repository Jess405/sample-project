package com.interswitch.maven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void addition() throws IOException {
        try{
        BufferedReader br=null;
        int a;
        int b;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter second number:");
        b=Integer.parseInt(br.readLine());
            System.out.println(a+b);   }
        catch(IOException e){
            e.printStackTrace();
        }


    }

    public static void subtraction() throws IOException {
        try{
            BufferedReader br=null;
            int a;
            int b;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            b=Integer.parseInt(br.readLine());
            System.out.println(a-b);   }
        catch(IOException e){
            e.printStackTrace();
        }


    }


    public static void multiplication() throws IOException {
        try{
            BufferedReader br=null;
            int a;
            int b;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            b=Integer.parseInt(br.readLine());
            System.out.println(a*b);   }
        catch(IOException e){
            e.printStackTrace();
        }


    }


    public static void division() throws IOException {
        try{
            BufferedReader br=null;
            int a;
            int b;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            b=Integer.parseInt(br.readLine());
            System.out.println(a/b);   }
        catch(IOException e){
            e.printStackTrace();
        }


    }




    public static void chooseOperation() throws IOException{
        try {
            System.out.println("For subtraction enter: 1");
            System.out.println("For addition enter: 2");
            System.out.println("For multiplication enter: 3");
            System.out.println("For division enter: 4");
            BufferedReader br = null;
            int operand;
            br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
            operand = Integer.parseInt(br.readLine());
            if (operand == 1) {
                Calculator.subtraction();
            }
            if (operand == 2) {
                Calculator.addition();
            }

            if (operand == 3) {

                Calculator.multiplication();
            }
            if (operand == 4) {
                Calculator.multiplication();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
