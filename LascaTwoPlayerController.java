import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LascaTwoPlayerController {
	public static void main(String[] args) {
		LascaTwoPlayerController controller = new LascaTwoPlayerController();
		controller.go();
	}
	
	
	public void go() {
		LascaBoard board = new LascaBoard();
		LascaTextView view = new LascaTextView(board);
		LascaBoardSpace current = LascaBoardSpace.Player1;
		File file = new File("output.dat");
		PrintWriter output = null;
		try {
			output = new PrintWriter(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not create output.dat");
			return;
		}
		while(board.checkWinner() == LascaBoardSpace.Available) {
			view.display();
			String move = makeMove(current, board);
			if(current == LascaBoardSpace.Player1)
				current = LascaBoardSpace.Player2;
			else
				current = LascaBoardSpace.Player1;
			
			output.println(move);
		}
		System.out.println("Player " + board.checkWinner() + " won.");	
		output.close();
		
			}
			public String makeMove(LascaBoardSpace current, LascaBoard board) { 
				Scanner input = new Scanner(System.in);
				boolean moveMade = false;
				//while(! moveMade){
					System.out.print("Enter the row numberfor your move: ");
					int row = input.nextInt();
					System.out.print("Enter the column number for your move: ");
					int col = input.nextInt();
					board.movePlayer(current, new LascaBoardPosition(row, col));
					return ""+row + " "+col;
		//}
				
						
	}
}
