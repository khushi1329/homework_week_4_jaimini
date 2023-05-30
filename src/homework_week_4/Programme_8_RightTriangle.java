package homework_week_4;

/** Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme_8_RightTriangle {

    public static void main(String[] args) {

        int rows = 5;

              //Declare if loop
        for (int i = 1; i <= rows; i++) {
            for (int r = 1; r <= i; r++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
