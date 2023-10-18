
public class LascaTextView {
	private LascaBoard board;
	public LascaTextView(LascaBoard board) {
		this.board = board;
	}
	public void display() {
		for(int row = 0; row < board.getHeight(); row++) {
			for(int col = 0; col < board.getWidth(); col++) {
				LascaBoardSpace which = board.get(row, col);
				if(which == LascaBoardSpace.Available)
					System.out.print("- ");
				if(which == LascaBoardSpace.Player1)
					System.out.print("B ");
				if(which == LascaBoardSpace.Player2)
					System.out.print("R ");
				
			}
			System.out.println();
		}
	}
}
