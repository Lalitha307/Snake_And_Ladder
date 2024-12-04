import java.util.Random;
public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Simulator!");
        int playerPosition = 0;
        int diceRollCount = 0;
        Random random = new Random();
        while (playerPosition < 100) {
            diceRollCount++;
            int dieRoll = random.nextInt(6) + 1;
            int option = random.nextInt(3);
            switch (option) {
                case 0: // No Play
                    System.out.println("Dice Roll " + diceRollCount + ": No Play, Player remains at " + playerPosition);
                    break;
                case 1: // Ladder
                    if (playerPosition + dieRoll <= 100) {
                        playerPosition += dieRoll;
                    }
                    System.out.println("Dice Roll " + diceRollCount + ": Ladder, Player moves to " + playerPosition);
                    break;
                case 2: // Snake
                    playerPosition -= dieRoll;
                    if (playerPosition < 0) playerPosition = 0;
                    System.out.println("Dice Roll " + diceRollCount + ": Snake, Player moves to " + playerPosition);
                    break;
            }
        }
        System.out.println("Player wins the game in " + diceRollCount + " rolls!");
    }
}
