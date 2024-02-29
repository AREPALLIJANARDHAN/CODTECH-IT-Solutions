package com.NumberGuessGame;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessGame{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Random random=new Random();
       int lowerbound =1;
       int upperbound=100;
       int targetNumber=random.nextInt(upperbound-lowerbound+1)+lowerbound;
       int attempts=0;
       int maxAttempts=5;
       boolean guessChoice=false;
        System.out.println("welcome To NumberGuessing Game !");
        System.out.println("_______________________________");
       while(attempts<maxAttempts){
           System.out.println("please enter your guess 1-100 only ");
           int userGuess= scanner.nextInt();
           if(userGuess==targetNumber){
               guessChoice=true;
               break;

           }
           else if(userGuess<targetNumber){
               System.out.println("Your Guess is low Please try Again");
           }
           else{
               System.out.println("your Guess is High Please try Again");
               System.out.println();
           }
           attempts++;
       }
        if (guessChoice) {
            System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
        }
    }

