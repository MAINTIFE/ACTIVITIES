package Hangman_GUI;

import Hangman.RunTimeException;

public class MenuInputException extends RunTimeException {
    MenuInputException(){
        System.out.println("Please provide a valid input (1-3)");
    }
}
