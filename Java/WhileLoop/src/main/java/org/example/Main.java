package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. example of while loop
        System.out.println("First example of While loop  :-");
        System.out.println("Bake a batch of 12 cupcakes to complete 96 cupcakes:-");
        int cupcakesBaked = 0;
        while (cupcakesBaked < 100) {
            cupcakesBaked += 12;
            System.out.println("Baked " + cupcakesBaked + " cupcakes so far!");
        }
        // 2. example of while loop.
        System.out.println("second example of while loop");
        System.out.println("Person  At bottom  stairs of mkpti!!");
        int stepsClimbed = 0;
        while (stepsClimbed < 20) {
            // Climb the next step
            stepsClimbed++;
            System.out.println("Climbed step #" + stepsClimbed);
        }
        System.out.println(" Person  Reached the top  stairs of Mkpti!");

        //3. example of do while loop

        int secretNumber = 7;
        int playerGuess;

        do {
            Scanner scannerNumber = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Guess the secret number (between 1 and 10): ");

            int  number= scannerNumber.nextInt();
            // Prompt player to guess the number

            playerGuess = number;

            // Check if the guess is correct
            if (playerGuess == secretNumber) {
                System.out.println("Congratulations, you guessed the secret number!");
            } else {
                System.out.println("Sorry, that's not the secret number. Try again!");
            }
        } while (playerGuess != secretNumber);



          int mixingTime=0;
          do{
              mixingTime++;
              System.out.println("Mixing the masala for"+mixingTime);
          }while(mixingTime<=5);
          System.out.println("Mixing of masala done");

    }
}