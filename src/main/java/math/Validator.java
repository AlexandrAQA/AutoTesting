package math;

public class Validator {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void validateAdditionAnswer(int answer, int a, int b){
        if (answer == a + b){
            System.out.println(" Good Job! :-) ");
        } else {
            System.out.println(ANSI_RED + "!!! W-R-O-N-G-!!! :-((" + ANSI_RESET);
        }
    }
    public void validateSubtractionAnswerA(int answer, int a, int b){
        if (answer == a - b){
            System.out.println(" Good Job! :-) ");
        } else {
            System.out.println(ANSI_RED + "!!! W-R-O-N-G-!!! :-((" + ANSI_RESET);
        }
    }
    public void validateSubtractionAnswerB(int answer, int b, int a){
        if (answer == b - a){
            System.out.println(" Good Job! :-) ");
        } else {
            System.out.println(ANSI_RED + "!!! W-R-O-N-G-!!! :-((" + ANSI_RESET);
        }
    }
}
