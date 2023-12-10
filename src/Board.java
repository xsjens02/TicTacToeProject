import java.util.Scanner;
public class Board {
    //region instance variable
    private final char[][] board = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
    };
    //endregion
    //region instance methods
    /**
     * lets a player make a move (add position) on board object
     * @param currentPlayer having turn to make a move
     */
    public void makeMove(Player currentPlayer) {
        System.out.println(currentPlayer.getPlayerName() + " your turn!");
        addPosition(currentPlayer);
    }

    /**
     * checks weather a coordinate is occupied
     * @param y row coordinate
     * @param x column coordinate
     * @return true if free, false if not
     */
    public boolean isAddMoveValid(int y, int x) {
        return board[y][x] == '_';
    }

    /**
     * adds a position (character) on board
     * @param currentPlayer object to retrieve character from
     */
    public void addPosition(Player currentPlayer) {
        System.out.println("Choose coordinate to add position");
        do {
            int y = getUserInt("Coordinate y-axis: ");
            int x = getUserInt("Coordinate x-axis: ");
            if (isAddMoveValid(y, x)) {
                board[y][x] = currentPlayer.getPlayerChar();
                break;
            }
            System.out.println("Invalid move! Please try again!");
        } while (true);
    }

    /**
     * displays current board
     */
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5s", board[i][j]);
            }
            System.out.println();
        }
    }
    //endregion
    //region static methods
    /**
     * prompt user for an integer input until valid input
     * @param prompt required input
     * @return integer
     */
    public static int getUserInt(String prompt) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print(prompt);
            String input = in.nextLine();
            if (isInteger(input)) {
                int num = Integer.parseInt(input) - 1;
                if (isCoordinateValid(num)) {
                    return num;
                }
            }
            System.out.println("Invalid input! Please try again!");
        } while (true);
    }

    /**
     * checks weather a string is can be parsed to an integer
     * @param str is string to check
     * @return true if string can be parsed, false if not
     */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * checks weather a given coordinate is within board object grid (x- & y-axis)
     * @param coordinate to check
     * @return true if within grid, false if not
     */
    public static boolean isCoordinateValid(int coordinate) {
        return 0 <= coordinate && coordinate < 3;
    }
    //endregion
}
