
public class Position {

	private int row;
	private char seat;

	// Copy Constructor
	public Position(Position p) {
		// Deep copy
		if (p != null) {
			// I could just write row = p.row. this works only here
			//because we are in the Position Object and p is an object
			//of type position. However, it is good coding practice to 
			//use getters and setters EVERYWHERE!!
			setRow(p.getRow()); 
			setSeat(p.getSeat());	
		}
	}
	@Override
    public String toString(){
    	//String s =  
    	return "Row is: " +row + " and seat is: " + seat + "\n";
    }
	public Position(int r, char s) {
		setRow(r);
		setSeat(s);
	}
	public Position() {

	}




	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public char getSeat() {
		return seat;
	}

	public void setSeat(char seat) {
		this.seat = seat;
	}

}
