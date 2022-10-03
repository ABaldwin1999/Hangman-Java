package org.example;

import java.util.ArrayList;

public class PlayGame {
    public static void run() {
        Storage currentGame = new Storage(Storage.getWords(), false, 8, new ArrayList<>(), new ArrayList<>());
        displayWord(currentGame.getCorrectGuessArr(),currentGame.getGuessArr(),currentGame.getWord());
        while (!currentGame.isGameOver()) {
            System.out.println("Guess a letter");
            String choose = "";
            String choice;
            choice = PlayerInterface.checkInputValid("a letter please", choose);
            PlayerInterface.dealWithGuesses(choice.toLowerCase(),currentGame,currentGame.getGuessArr(), currentGame.getCorrectGuessArr());
            displayWord(currentGame.getGuessArr(),currentGame.getCorrectGuessArr(),currentGame.getWord());
            gameOver(currentGame, currentGame.getWord(), currentGame.getPoints());
        }

    }
    public static void displayWord(ArrayList<String> guessArr,ArrayList<String> correctGuessArr, String word){
        StringBuilder displayWord = new StringBuilder();
            for (int i = 0; i < word.length() ; i++) {
                if(correctGuessArr.contains(word.split("")[i])){
                    displayWord.append(word.split("")[i]);
                }
                else {
                    displayWord.append('_');
                }
            }
        System.out.println(displayWord +"\n you have already guessed "+ guessArr.toString());

    }
    public static void addCorrectGuesses(Storage currentGame, ArrayList<String> correctGuessArr,String choice){
        correctGuessArr.add(choice);
        currentGame.setCorrectGuessArr(correctGuessArr);
    }
    public static void addGuessed(Storage currentGame, ArrayList<String> guessArr,String choice){
        guessArr.add(choice);
        currentGame.setGuessArr(guessArr);
    }
    public static void checkGuess(Storage currentGame, ArrayList<String> guessArr,ArrayList<String> correctGuessArr,String choice){
            if(currentGame.getWord().contains(choice)){
                addGuessed(currentGame,guessArr,choice);
                addCorrectGuesses(currentGame,correctGuessArr,choice);
            }
            else{
                currentGame.decreasePoints();
                addGuessed(currentGame,guessArr,choice);
            }
    }
    public static void gameOver(Storage currentGame,String word, int points) {
        if ((word.length() == currentGame.getCorrectGuessArr().size())) {
            System.out.println("You win!");
            currentGame.setGameOver(true);
        }
        else if((points == 0)){
            System.out.println("You lose!");
            currentGame.setGameOver(true);
        }
    }
}
