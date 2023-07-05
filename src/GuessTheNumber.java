import java.lang.Math;

public class GuessTheNumber {

    public static void main(String[] args) {
        int computerNumber = (int)(Math.random() * 100);
        System.out.println("Загаданное число: " + computerNumber);
        for (int i = 1; i < 100; i++) {
            int playerNumber = i;
            if (computerNumber < playerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else if (computerNumber > playerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            } else
                break;
        }
         System.out.println("Вы победили!");
    }
}



