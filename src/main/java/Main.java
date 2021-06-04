/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class Main {
    public static final double USD_EXCHANGE_RATE = 100.00278;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging?");
        int euros = in.nextInt();
        System.out.print("What is the exchange rate?");
        double rate = in.nextDouble();
        double amount_to = (euros * rate) / USD_EXCHANGE_RATE;
        System.out.printf("%d euros at an exchange rate of %.2f is\n", euros, rate);
        System.out.printf("%.2f U.S. dollars.", amount_to);
    }
}