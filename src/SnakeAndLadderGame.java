import java.util.Random;
public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Simulator!");
        int player1Position = 0, player2Position = 0;
        int diceRollCount = 0;
        Random random = new Random();
        while (player1Position < 100 && player2Position < 100) {
            // Player 1 Turn
            diceRollCount++;
            System.out.println("Player 1's Turn:");
            player1Position = playTurn(random, player1Position);
            if (player1Position == 100) {
                System.out.println("Player 1 wins the game in " + diceRollCount + " rolls!");
                break;
            }
            // Player 2 Turn
            diceRollCount++;
            System.out.println("Player 2's Turn:");
            player2Position = playTurn(random, player2Position);
            if (player2Position == 100) {
                System.out.println("Player 2 wins the game in " + diceRollCount + " rolls!");
                break;
            }
        }
    }
    public static int playTurn(Random random, int playerPosition) {
        int dieRoll = random.nextInt(6) + 1;
        int option = random.nextInt(3);
        switch (option) {
            case 0: // No Play
                System.out.println("No Play, Player remains at " + playerPosition);
                break;
            case 1: // Ladder
                if (playerPosition + dieRoll <= 100) {
                    playerPosition += dieRoll;
                    System.out.println("Ladder! Player moves to " + playerPosition + " and gets another turn.");
                    playerPosition = playTurn(random, playerPosition); // Recursive call for extra turn
                }
                break;
            case 2: // Snake
                playerPosition -= dieRoll;
                if (playerPosition < 0) playerPosition = 0;
                System.out.println("Snake! Player moves to " + playerPosition);
                break;
        }
        return playerPosition;
    }
}
