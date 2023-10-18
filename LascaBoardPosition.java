
public class LascaBoardPosition {
	private int row;
	 
	private int column;
	 
	 
	public LascaBoardPosition (int row, int column)
	 	
	{
	 
	this.row = row;
	 
	this.column = column;
	 
	}
	 
	public int getRow()
	 
	{
	 
	return row;
	 
	}
	 
	public int getColumn()
	 
	{
	 
	return column;
	 
	}
	 
	@Override
	 
	public String toString()
	 
	{
	 
	return "BoardPosition [row=" + row + ", column=" + column + "]";
	 
	}
}
