/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subtraction;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author maste
 */
public class Subtraction {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            int number1 = rand.nextInt(10);
            int number2 = rand.nextInt(10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + " - " + number2 + "? ( or Type 'X' to quit)");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("X")) {
                break;
            }

            try {
                int answer = Integer.parseInt(response);

                if (answer == (number1 - number2)) {
                    System.out.println("Correct Anwer, Thank you!");
                } else {
                    System.out.println("Ooh Sorry, Incorrect. The correct answer is " + (number1 - number2));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or type 'X' to quit.");
            }
        }
        input.close();
    }
}
