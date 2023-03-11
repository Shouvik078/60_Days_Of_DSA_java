package Day52;

import java.util.*;

public class NumberGusseingGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int myNumber = (int) (Math.random() * 100);
            int userNumber = 0;
            do {
                System.out.println("Guess My Number : ");
                userNumber = sc.nextInt();

                if (userNumber == myNumber) {
                    System.out.println("Congratulations!.. Correct answer");
                    break;
                } else if (userNumber > myNumber) {
                    System.out.println("Your Number is Too Large");
                } else {
                    System.out.println("Your Number is Too small");
                }
            } while (userNumber >= 0);
            System.out.println("My Number Was : " + myNumber);
        }
    }
}
