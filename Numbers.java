package NyLotto;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;

public class Numbers {

    static Date date = new Date();
    static SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm");
    static Random random = new Random();

    static int numberOne = 0 + random.nextInt(9);
    static int numberTwo = 0 + random.nextInt(9);
    static int numberThree = 0 + random.nextInt(9);

    static int numberOneFour = 0 + random.nextInt(9);
    static int numberTwoFour = 0 + random.nextInt(9);
    static int numberThreeFour = 0 + random.nextInt(9);
    static int numberFourFour = 0 + random.nextInt(9);

    public static void main(String[] args) {

        System.out.println("\n                            [ WELCOME TO THE NY LOTTO ] \n " +
                "Today at " + formatter.format(date) + ", we will be presenting the winning numbers right now. " +
                "\n                                 Good Luck!");

        System.out.println("\n OUR WINNING 3 NUMBERS FOR TODAY ARE! \n");
        winningThreeNumbers();

        System.out.println("\n OUR WINNING 4 NUMBERS FOR TODAY ARE! \n");
        winningFourNumbers();

    }

    protected static void winningThreeNumbers() {

        System.out.println("            " + numberOne + " " + numberTwo + " " + numberThree);

    }

    protected static void winningFourNumbers() {

        System.out.println("            " +  numberOneFour + " " + numberTwoFour + " " + numberThreeFour + " " + numberFourFour);

    }
}