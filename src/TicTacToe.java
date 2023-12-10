public class TicTacToe {
    //region instance variables
    private final Player player1;
    private final Player player2;
    private final Board gameBoard;
    //endregion
    //region constructor
    /**
     * constructor method, creates two player objects and one board object
     */
    public TicTacToe() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.gameBoard = new Board();
    }
    //endregion
    //region main method
    /**
     * main method, will play game TicTacToe
     */
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
    //endregion
}
