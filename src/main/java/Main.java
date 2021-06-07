/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging?");
        int euros = in.nextInt();
        System.out.print("What is the exchange rate?");
        double rate = in.nextDouble();
        double amount_to = (euros * rate);
        System.out.printf("%d euros at an exchange rate of %.2f is\n", euros, rate);
        System.out.printf("%.2f U.S. dollars.", amount_to);
    }
}