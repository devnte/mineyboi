public class Mine{
	
	public static String[][] board;

	public static int bombs;

	public static void createBoard(){
		board = new String[8][8];
		return;
	}

	public static void createBoard(int x, int y){
		board = new String[x][y];
	}

	public static void fillBombs(int b){
		int column = 0;
		int row = 0;
		while (b > 0){
			if (board[column][row] == null){
				board[column][row] = "b";
				b -=1;
				column += 1;
				row += 1;
			}
		}
	}

	public static void main(String[] args) {
		createBoard();
		fillBombs(5);
		for(int j = 0; j < board.length; j ++){
			System.out.println(" ");
			for (int i = 0; i < board[0].length; i ++){
				System.out.print("[" + board[i][j] + "]");
			}
		}
	}
}