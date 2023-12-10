public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private final Board gameBoard;

    public TicTacToe() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.gameBoard = new Board();
    }
    public void playGame() {
        gameBoard.displayBoard();
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                gameBoard.makeMove(player1);
                gameBoard.displayBoard();
            } else {
                gameBoard.makeMove(player2);
                gameBoard.displayBoard();
            }
        }
    }
}
