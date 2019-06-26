
public class Passenger {
	
	private String name;
	private Position assignedSeat;//object of type position 
	
	public Passenger (String n, Position p){
		name = n;
		//deep copy of p - that is, assignedSeat will contain
		//its OWN copy of p (i.e. deep copy)
		//assignedSeat = new Position (p.getRow(), p.getSeat());
		//better looking deep copy:
		assignedSeat = new Position (p);
		
		//Shallow copy of p - assignedSeat and p are both pointing
		//to the same memory
		//assignedSeat = p;
	}
	public Passenger (String n, int row, char seat){
		name = n;
		assignedSeat = new Position (row, seat);
	}
	public Position getAssginedSeat (){
		return assignedSeat;
	}
	
	@Override
    public String toString(){
		//Here, object assignedSeat, makes an implicit call
		//to the toString method in its Class (i.e. the Position Class)
    	String s = "Passenger Name: " +name + "\n" + assignedSeat; 
    	return s;
    }

    public String getName() {
        return name;
    }

    public Position getAssignedSeat() {
        return assignedSeat;
    }
}
