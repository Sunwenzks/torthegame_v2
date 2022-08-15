import java.util.Scanner;

public class TorTheGame {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            if (initialTy > lightY) {
                System.out.println("N");
                initialTy--;
            } else if (initialTy < lightY) {
                System.out.println("S");
                initialTy++;
            }
            if (initialTx > lightX) {
                System.out.println("W");
                initialTx--;
            } else if (initialTx < lightX) {
                System.out.println("E");
                initialTx++;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            //System.out.println("");
        }
    }
}
