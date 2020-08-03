package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    static boolean checkPerfect(int a){
        int sum=0;
        for (int i=1;i<a;i++)
            if (a%i == 0)
                sum+=i;
        if (sum == a)
            return true;
        else
            return false;

    }
    static boolean same(int a[],int b[]){
        if (count(a) == count(b))
            return true;
        else
            return false;

    }
    static int[] getArray(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<n;i++)
            numbers[i]=input.nextInt();
        return numbers;
    }

    static String getString(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Your String");
        String a = input.nextLine();
        return a;
    }
    static int count(int[] a){
        int f=0;
        int j;
        for (int i=0;i<a.length;i++) {
            for ( j = 0; j < i; j++)
                if (a[i] == a[j])
                    break;
            if (i == j)
                f++;
        }
        return f;

    }

    static String toCamelCase (String a){
        for (int i=0;i<a.length();i++)
            if (a.charAt(i) == '-')
                a = a.substring(0, i) + a.substring(i + 1, i+2).toUpperCase()+a.substring(i + 2, a.length());

        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while (true){
            System.out.println("Enter Your preference 1. Same 2. Perfect No 3. Camel Case 4. Object to Array 0. Exit");
            int x = scan.nextInt();
            if (x == 1)
                System.out.println(same(getArray(),getArray()));
            else if (x == 2) {
                System.out.println("Enter the no");
                n=scan.nextInt();
                System.out.println(checkPerfect(n));
            }
            else if (x == 3)
                System.out.println(toCamelCase(getString()));
            else if (x == 0)
                break;
            else
                System.out.println("Enter valid Option");
        }




    }
}
