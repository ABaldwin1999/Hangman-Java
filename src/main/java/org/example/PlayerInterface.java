package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class PlayerInterface {
    static Scanner scanner = new Scanner(System.in);
    public static String checkInputValid(String validValues, String choose) {
        try{
            choose = scanner.nextLine();
        }
        catch(Exception e){
            System.out.println("Please input valid"+validValues);
            checkInputValid(validValues, choose);
        }
        return choose;
    }
    public static void dealWithGuesses(String choice, Storage currentGame, ArrayList<String> guessArr,ArrayList<String> correctGuessArr){
        if (choice.length()==1 && !choice.isBlank()&&!guessArr.contains(choice)) {
            PlayGame.checkGuess(currentGame,guessArr, correctGuessArr,choice);
        } else if (choice.length() > 1) {
            System.out.println("choose a letter not a word");
        }
        else if(guessArr.contains(choice)){
            System.out.println("you have already tried this letter");
        }else {
            System.out.println("please choose a valid letter");
        }
    }
}
