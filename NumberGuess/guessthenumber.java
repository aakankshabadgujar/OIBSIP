
import javax.swing.*;

public class guessthenumber {
    static int flag = 0;

    public static void main(String[] args) {

        int yo = JOptionPane.showConfirmDialog(null, "Wanna have some fun??");
        if (yo == JOptionPane.YES_OPTION) {
            guessing(10);
        } else {
            JOptionPane.showMessageDialog(null, "Such an idiotic loser!!HAHAHA!!");
            System.exit(0);
        }

    }

    public static void guessing(int count) {
        int randomno = (int) (Math.random() * 100 + 1);
        int guess = 0;
        System.out.println("The correct guess would be " + randomno);
        JOptionPane.showMessageDialog(null, "You have 10 attempts! Let's start!! ");
        while (guess != randomno) {

            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            guess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " " + determineGuess(guess, randomno, count) + "");
            count--;
            if (count == 0 || flag == 1) {
                JOptionPane.showMessageDialog(null, "Game is  over! \n");
                int yesno = JOptionPane.showConfirmDialog(null, "Wanna have next round?");
                if (yesno == JOptionPane.YES_OPTION) {
                    guessing(10);
                } else {
                    JOptionPane.showMessageDialog(null, "Such an idiotic loser!!HAHAHA!!");
                    System.exit(0);
                }
            }
        }

    }

    public static String determineGuess(int guess, int randomno, int count) {

        if (guess <= 0 || guess > 100) {
            return "Your guess is invalid";
        } else if (guess == randomno) {
            flag = 1;
            return "Correct!\nTotal Points: " + count;

        } else if (guess > randomno) {
            return "Your guess is too high, try again.\n Attempts Remaining: " + count;
        } else if (guess < randomno) {
            return "Your guess is too low, try again.\n Attempts Remaining: " + count;
        } else {
            return "Your guess is incorrect\n Attempts Remaining: " + count;

        }
    }
}