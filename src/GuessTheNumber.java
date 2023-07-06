public class GuessTheNumber {
    
    public static void main(String[] args) {
        int computerNumber = generateComputerNumber();
        int playerNumber = 0;

        while (playerNumber != computerNumber) {
            playerNumber = calculateNextGuess(playerNumber, computerNumber);

            if (playerNumber > computerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else if (playerNumber < computerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            } else;
        }
        System.out.println("Вы победили! Загаданное число: " + computerNumber);
    }

    private static int generateComputerNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    private static int calculateNextGuess(int previousGuess, int computerNumber) {
        return previousGuess + 1;
    }
}


