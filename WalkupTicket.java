//------------------------------------------------------------------------------
//A WalkupTicket represents a ticket with a ticket number, a price of $50.00,
//and it was purchased the day of the event.

public class WalkupTicket extends Ticket {
	
	//Fields:
	private double price = 50.0;
	
	//Constructors:
	public WalkupTicket(int number) {
		super(number);
	}

	//Methods:	
	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Ticket Number: " + super.getNumber() + ", Price: $" + getPrice(); 
	}

}
