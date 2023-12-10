import java.util.Scanner;
public class Board {
    private final char[][] board = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
    };
    public void makeMove(Player currentPlayer) {
        System.out.println(currentPlayer.getPlayerName() + " your turn!");
        addPosition(currentPlayer);
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5s", board[i][j]);
            }
            System.out.println();
        }
    }
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
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean isCoordinateValid(int coordinate) {
        return 0 <= coordinate && coordinate < 3;
    }

    public boolean isAddMoveValid(int y, int x) {
        return board[y][x] == '_';
    }
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
}
