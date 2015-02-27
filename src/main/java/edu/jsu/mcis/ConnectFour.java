package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
    public static final int COLS = 7;
	private final int ROWS = 6;
	private Location [][] board;
	private boolean redTurn;
	
    public ConnectFour() {
        board = new Location[ROWS][COLS];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = Location.EMPTY;
			}
		}
		redTurn = true;
    }
    
    public Location getTopOfColumn(int column) {
		return Location.EMPTY;
    }
    
    public int getHeightOfColumn(int column) {
        return 0;
    }
    
    public boolean dropToken(int column) {
       	return true;
    }
}