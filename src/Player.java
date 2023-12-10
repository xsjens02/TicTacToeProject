import java.util.Scanner;
public class Player {
    //region static variable
    public static int playerCount = 0;
    //endregion
    //region instance variables
    private String playerName;
    private char playerChar;
    //endregion
    //region constructor
    /**
     * constructor method, will prompt user for an object name + set object character to either 'x' or 'o'
     */
    public Player() {
        playerCount++;
        setPlayerName();
        if (playerCount == 1) {
            setPlayerChar('x');
        } else {
            setPlayerChar('o');
        }
    }
    //endregion
    //region instance methods
    /**
     * prompt user for a player name, then set object name to input
     */
    public void setPlayerName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Player" + playerCount + " name: ");
        this.playerName = in.next();
    }

    /**
     * getter method for object name
     * @return object name
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * setter method for object character
     * @param character for object
     */
    public void setPlayerChar(char character) {
        this.playerChar = character;
    }

    /**
     * getter method for object character
     * @return object character
     */
    public char getPlayerChar() {
        return this.playerChar;
    }
    //endregion
}
