import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static int randomNum() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;

        System.out.println("Random Number: " + randomNumber);
        return randomNumber;
    }

    public static void game() {

        Scanner sc = new Scanner(System.in);
        int r = NumberGame.randomNum();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Guess the number in my mind, Hint 1 to 100 ");
            try {
                int g = sc.nextInt();
                if (r == g) {
                    System.out.println("you guess Right number in " + i + " attemt");
                    System.out.println("your score is " + (101 - i * i));
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Enter only numeric value");

            }
        }
        System.out.println("you loose the Game..");

    }

    public static void main(String[] args) {
        NumberGame.game();
    }
}
