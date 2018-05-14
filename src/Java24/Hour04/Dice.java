package Java24.Hour04;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int value = generator.nextInt(6) + 1; //Fixed from 1 to 6

        System.out.println("The random number is "
                + value);
    }
}
