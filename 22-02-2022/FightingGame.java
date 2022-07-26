import java.util.Scanner;

public class FightingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1Health = 100;
        int player2Health = 100;
        System.out.println("Mulai!");
        while (player1Health > 0 || player2Health > 0) {
            System.out.print("Player 1: ");
            String player1Move = sc.next();
            System.out.print("Player 2: ");
            String player2Move = sc.next();

            if (player1Move.equals("X")) {
                if (!player2Move.equals("A")) {
                    player2Health = player2Health - 10;
                }
            } else if (player1Move.equals("Y")) {
                if (!player2Move.equals("A")) {
                    player2Health = player2Health - 20;
                }
            } else if (player1Move.equals("B")) {
                if (!player2Move.equals("A")) {
                    player2Health = player2Health - 30;
                }
            }
            if (player2Move.equals("X")) {
                if (!player1Move.equals("A")) {
                    player1Health = player1Health - 10;
                }
            } else if (player2Move.equals("Y")) {
                if (!player1Move.equals("A")) {
                    player1Health = player1Health - 20;
                }
            } else if (player2Move.equals("B")) {
                if (!player1Move.equals("A")) {
                    player1Health = player1Health - 30;
                }
            }
            if (player1Health < 1) {
                System.out.println("Player 2 menang!");
                sc.close();
                break;
            } else if (player2Health < 1) {
                System.out.println("Player 1 menang!");
                sc.close();
                break;
            }
        }

    }
}
