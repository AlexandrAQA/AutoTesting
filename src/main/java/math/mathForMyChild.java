package math;

import java.util.Scanner;

public class mathForMyChild {
    static int number = 1;
    public static void main(String[] args) {
        Validator validator = new Validator();
        //easy code for my 7y.o child
        System.out.println("how many math examples would you like to solve?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int range = 15;
            int a = (int) (Math.random() * range);
            int b = (int) (Math.random() * range);
            System.out.println(number++ +")" +a + " + " + b + " =  ");

            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            System.out.println("The right answer is:" + (a + b));
            validator.validateAdditionAnswer(answer, a, b);

            if (a >= b) {
                System.out.println(number ++ + ")" + a + " - " + b + " =  ");
                Scanner sc2 = new Scanner(System.in);
                int answer2 = sc.nextInt();
                System.out.println("The right answer is:" + (a - b));
                validator.validateSubtractionAnswerA(answer2, a, b);

            } else {
                System.out.println(number ++ +")" +b + " - " + a + " =  ");
                Scanner sc2 = new Scanner(System.in);
                int answer2 = sc.nextInt();
                System.out.println("The right answer is:" + (b - a));
                validator.validateSubtractionAnswerB(answer2, b, a);
            }


        }
        System.out.println("Well Done!!! :-) ");
    }
}
