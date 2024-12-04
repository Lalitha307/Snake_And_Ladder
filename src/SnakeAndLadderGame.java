//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Simulator!");
        int playerPosition = 0;
        System.out.println("Player starts at position: " + playerPosition);
        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1; // Rolling a die (1-6)
        System.out.println("Player rolled a: " + dieRoll);
        int option = random.nextInt(3); // 0: No Play, 1: Ladder, 2: Snake
        switch (option) {
            case 0:
                System.out.println("No Play: Player stays at the same position.");
                break;
            case 1:
                playerPosition += dieRoll;
                System.out.println("Ladder: Player moves to position " + playerPosition);
                break;
            case 2:
                playerPosition -= dieRoll;
                if (playerPosition < 0) playerPosition = 0;
                System.out.println("Snake: Player moves to position " + playerPosition);
                break;
        }
    }
}