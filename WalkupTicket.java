//------------------------------------------------------------------------------
//A WalkupTicket represents a ticket with a ticket number, a price of $50.00,
//and it was purchased the day of the event.

public class WalkupTicket extends Ticket {
	
	//Fields:
	private double ticketPrice = 50.0;
	
	//Constructors:
	public WalkupTicket(int ticketNumber) {
		super(ticketNumber);
	}

	//Methods:	
	public double getPrice() {
		return ticketPrice;
	}

	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice(); 
	}

}
