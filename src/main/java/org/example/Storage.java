package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Storage {
    static String[] words = {
            "meow","bog","flaunt"
    };
    private String word;
    private boolean gameOver;
    private int points;
    private ArrayList<String> guessArr;
    private ArrayList<String> correctGuessArr;


    public Storage(String word, boolean gameOver, int points, ArrayList<String> guessArr, ArrayList<String> correctGuessArr) {
        this.word =getWords();
        this.gameOver = gameOver;
        this.points = points;
        this.guessArr = guessArr;
        this.correctGuessArr = correctGuessArr;
    }

    public String getWord() {
        return word;
    }


    public void setWord(String word) {
        this.word = word;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void decreasePoints() {
        this.points -= 1;
    }
    public ArrayList<String> getGuessArr() {
        return guessArr;
    }

    public void setGuessArr(ArrayList<String> guessArr) {
        this.guessArr = guessArr;
    }

    public ArrayList<String> getCorrectGuessArr() {
        return correctGuessArr;
    }

    public void setCorrectGuessArr(ArrayList<String> correctGuessArr) {
        this.correctGuessArr = correctGuessArr;
    }

    public static String getWords() {
        ////get random from array of words
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}
