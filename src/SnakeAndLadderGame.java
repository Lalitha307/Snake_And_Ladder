import java.util.Random;
public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Simulator!");
        int playerPosition = 0;
        Random random = new Random();
        while (playerPosition < 100) {
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);
            switch (option) {
                case 0: // No Play
                    break;
                case 1: // Ladder
                    if (playerPosition + dieRoll <= 100) {
                        playerPosition += dieRoll;
                    }
                    break;
                case 2: // Snake
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) playerPosition = 0;
                    break;
            }

            System.out.println("Player is at position: " + playerPosition);
        }

        System.out.println("Player wins the game by reaching position 100!");
    }
}
