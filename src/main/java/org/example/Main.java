package org.example;
import java.util.ArrayList;
import org.example.PlayGame;
public class Main {


    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to hangman!\n Play game?(y/n)");
            String choose = "";///better with checker of validity
            String choice = "";
            choice = PlayerInterface.checkInputValid("y or n", choose);
            if (choice.toLowerCase().equals("y")) {
                PlayGame.run();
            } else if (choice.toLowerCase().equals("n")) {
                System.out.println("I hope you'll come and play soon!");
            } else {
                System.out.println("please choose y or n");
            }
        }
    }
}