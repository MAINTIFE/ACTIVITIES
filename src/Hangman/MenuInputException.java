package Hangman;

public class MenuInputException extends RunTimeException {
    public MenuInputException(){
        System.out.println("Please provide a valid input (1-3)");
    }
}
