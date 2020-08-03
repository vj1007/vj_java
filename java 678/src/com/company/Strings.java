package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Strings {



    public static void main(String[] args) {

        String a = "the-man-is-last";
        Scanner input =new Scanner(System.in);
        for (int i=0;i<a.length();i++)
            if (a.charAt(i) == '-')
                a = a.substring(0, i) + a.substring(i + 1, i+2).toUpperCase()+a.substring(i + 2, a.length());


        Character.toUpperCase(a.charAt(1));
        System.out.println(a);

    }
}
