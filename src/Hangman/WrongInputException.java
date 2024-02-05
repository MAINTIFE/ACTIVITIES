package Hangman;

public class WrongInputException extends RunTimeException {
    public WrongInputException(){
        System.out.println("Please provide a single character only!");
    }
}
