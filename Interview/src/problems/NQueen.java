package problems;

class Position {
	int row;
	int col;
	public Position(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
}

public class NQueen {
	public static void main(String[] args) {
		int quenSize = 4;
		NQueen nQueen = new NQueen();
		nQueen.solveNQueen(quenSize);
		
	}
	
	void solveNQueen(int size) {
		Position[] result = new Position[4];
		boolean hasSol = solve(size, 0, result);
		if (hasSol) {
			for (Position position :result) {
				System.out.println( position.row + " " +position.col);
			}
		} else {
			System.out.println("No solution");
		}
		
	}
	
	boolean solve(int size, int row, Position[] result) {
		if (row == size) {
			return true;
		}
		boolean isFound = true;
		
		for (int col =0 ; col < size; col++) {
			isFound = true;
			
			for (int queen = 0; queen < row; queen++) {
				if (result[queen].col == col || 
					result[queen].row - result[queen].col == row-col ||
					result[queen].row + result[queen].col == row + col) {
					isFound = false;
				}
			}
			
			if(isFound) {
				result[row] = new Position(row, col);
				if(solve(size, row + 1, result)) {
					return true;
				}
				
			}
		}		
		return false; 
	}
}
