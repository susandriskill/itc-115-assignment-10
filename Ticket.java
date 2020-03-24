//------------------------------------------------------------------------------
//A Ticket represents a ticket with a ticket number.

public abstract class Ticket {
	
	//Fields:
	private int number;
	
	//Constructors:
	public Ticket(int number) {
		this.number = number;
	}
	
	//Getters:
	public int getNumber() {
		return number;
	}
	
	//Methods:
	public abstract double getPrice();
	
	public abstract String toString();

}