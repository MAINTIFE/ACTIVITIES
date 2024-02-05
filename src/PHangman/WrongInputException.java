package PHangman;

public class WrongInputException extends RunTimeException{
    WrongInputException(){
        System.out.println("Please provide a single character only!");
    }
}
