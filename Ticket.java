//------------------------------------------------------------------------------
//A Ticket represents a ticket with a ticket number.

public abstract class Ticket {
	
	//Fields:
	private int ticketNumber;
	
	//Constructors:
	public Ticket(int ticketNumber) {
		this.ticketNumber = ticketNumber;	
	}
	
	//Getters:
	public int getNumber() {
		return ticketNumber;
	}
	
	//Methods:
	public abstract double getPrice();
	
	public abstract String toString();

}