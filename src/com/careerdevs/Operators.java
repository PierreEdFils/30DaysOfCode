package com.careerdevs;

public class Operators {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        //15% * 100 = 15
        double tip = meal_cost * tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        double total_cost =meal_cost + tip + tax;

        System.out.println(Math.round(total_cost)) ;

    }
}
