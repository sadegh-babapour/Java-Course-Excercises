public class Airplane {

	private Passenger [] passArray;
	private int numOfPassengers;
	private char [][] seatMap;
	private int numOfRows;

	public Airplane (int row){
		setNumOfPassengers (0);
		setNumOfRows (row);
		seatMap = new char [row][5];
		seatMapPopulator();
	}
	private void seatMapPopulator (){//helper method
		for (int i = 0; i < seatMap.length; i++){
			for (int j = 0; j < seatMap[i].length; j++)
				seatMap[i][j] = 'O';
		}
	}
	public void addPassenger (String p, int r, char s){
		if (checkAvailability (r, s) == false){//if NOT available 
			System.out.println("Seat not available!");
			return;
		}
		if (passArray == null){
			passArray = new Passenger [1]; //an array of objects of
			//type passenger
			//now I need to construct the object inside the array
			passArray [0] = new Passenger (p, r, s);

		}
		else{
			//step 1 getting new memory
			Passenger [] temp = new Passenger [passArray.length+1];
			//Step 2 Copy
			for (int i = 0; i < passArray.length; i++){
				temp[i]= passArray[i];
			}
			//step 3, construct the last element
			temp [temp.length-1] = new Passenger (p, r, s);
			//step 4 - take care of the reference
			passArray = temp;

		}
		seatMap[r][s - 'A'] = 'X';
		numOfPassengers++;

	}
	public void showSeats (){
        System.out.print("    A  B  C  D  E \n");
	    for (int i = 0; i < seatMap.length; i++){
            System.out.print(String.format("%-3s", i+1));
	        for (int j = 0; j < seatMap[i].length; j++){

			    System.out.print(" " + seatMap[i][j] + " ");
			}
			System.out.println();
		}
	}
	public String toString(){
		String s = "Number of Passengers is: " + numOfPassengers + "\n";
		s += "Number of rows: " + numOfRows + "\n";
//		s += "The seat map is as follows:\n";
//		for (int i = 0; i < seatMap.length; i++){
//			for (int j = 0; j < seatMap[i].length; j++){
//				s += seatMap[i][j] + " ";
//			}
//			s += "\n";
//		}
		s += "The passenger list as follows:\n";
		s += "    Names: "+String.format("%20s", "                    Row & Seat").replace(' ', ' ')+"\n";
		s += "==========================================\n";
		for (int i = 0; i < passArray.length; i++){
			s += (i+1) + "   "+String.format("%-30s", passArray[i].getName()).replace(' ', ' ')+
                    "|"+ (passArray[i].getAssginedSeat().getRow() +1) +
                    passArray[i].getAssginedSeat().getSeat()+"\n";
//			s += "";
		}

		return s;
	}

	public Position search(String name){
	    Position pos = new Position();
	    for (int i = 0; i < passArray.length;i++) {
            if(name.equals(passArray[i].getName())){
                System.out.println("Passenger found! " + passArray[i].getName() + " is at:");
                pos = passArray[i].getAssginedSeat();
                break;
            }
            else if (!name.equals(passArray[i].getName()) && i!=passArray.length-1) {
                i++;
            }
            else {
                System.out.println("Not found!");
                pos = null;
            }
	    }
	    return pos;
	}


	public boolean checkAvailability (int r, char s){
		//error checking
		if (r >= numOfRows || r < 0)
			return false;
		if (s - 'A' >= 5 || s - 'A' < 0)
			return false;
		//solution 
		if (seatMap [r][s - 'A'] == 'O')
			return true;
		else
			return false;

	}

	//Getters and Setters
	public void setNumOfRows (int n){
		numOfRows = n;
	}
	public int getNumOfRows (){
		return numOfRows;
	}
	public void setNumOfPassengers (int n){
		numOfPassengers = n;
	}
	public int getNumOfPassengers (){
		return numOfPassengers;
	}
	public Passenger [] getPassArray (){//returns an array of type Passenger 
		return passArray;
	}
	public Passenger getAPassenger(int i){//return an object of type Passenger 
		if (i < 0 || i >= passArray.length)
			return null;
		return passArray[i];
	}
}
