package com.careerdevs;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";


        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String l = scan.nextLine();



        int sum = i+a;
        double mod = d+ b;


        System.out.println(sum);
        System.out.println(mod);
        System.out.println(s+l);

    }
}
