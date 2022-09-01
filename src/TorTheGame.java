import java.util.Scanner;

public class TorTheGame {
    public enum directions
    {
        N,E,S,W,NE,SE,SW,NW
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            directions direction = directions.N;
            if (initialTx==lightX)
            {
                if (initialTy > lightY)
                {
                    //System.out.println("N");
                    direction = directions.N;
                    initialTy--;
                }
                else if (initialTy < lightY)
                {
                    //System.out.println("S");
                    direction = directions.S;
                    //direction = "S";
                    initialTy++;
                }
            }
            if (initialTy==lightY)
            {
                if (initialTx > lightX)
                {
                    //System.out.println("W");
                    direction = directions.W;
                    //direction = "W";
                    initialTx--;
                }
                else if (initialTx < lightX)
                {
                    // System.out.println("E");
                    direction = directions.E;
                    //direction = "E";
                    initialTx++;
                }
            }

            if (initialTy!=lightY | initialTx!=lightX){
                if (initialTy<lightY & initialTx>lightX){

                    //System.out.println("NW");
                    direction = directions.SW;
                    //direction = "SW";
                    initialTy--;
                    initialTx--;

                }
                else if (initialTy<lightY & initialTx<lightX){

                    //System.out.println("NE");
                    direction = directions.SE;
                    //direction = "SE";
                    initialTy--;
                    initialTx++;

                }
                else if (initialTy>lightY & initialTx<lightX){
                    //System.out.println("NE");
                    direction = directions.NE;
                    //direction = "NE";
                    initialTy++;
                    initialTx++;
                }
                else if (initialTy>lightY & initialTx>lightX){
                    // System.out.println("SW");
                    direction = directions.NW;
                    //direction = "NW";
                    initialTy++;
                    initialTx--;
                }
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(direction);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW

        }
    }
}
