package com.careerdevs;

import java.util.Scanner;

public class ReviewLoop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            String s =scn.next();
            String s_even ="";
            String s_odd ="";
            for (int j = 0; j <s.length(); j++) {
                if (j %2==0) {
                    s_even =s_even +s.charAt(j);

                } else {
                    s_odd = s_odd + s.charAt(j);
                }

            }
            System.out.println(s_even+""+s_odd);
        }
    }
}
