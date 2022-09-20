package com.bridgelabz.day2;

import java.util.Scanner;

public class ArithmaticOperator {

        public static void main(String[] args) {

            int a, b, c;
            System.out.print("enter three numbers");
            Scanner obj= new Scanner(System.in);
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();

            System.out.println("addition"  +(a+b+c));
            System.out.println("Total" +(c+a/b));
            System.out.println("Solution" +(a%b+c));
            System.out.println("Answer"  +(a*b+c));
        }
    }


