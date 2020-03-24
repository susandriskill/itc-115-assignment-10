//------------------------------------------------------------------------------
//An AdvanceTicket represents a ticket with a ticket number, a price of $30.00
//if it was purchased 10 or more days in advance of the event, and a price of 
//$40.00 if it was purchased fewer than 10 days in advance of the event.

public class AdvanceTicket extends Ticket {
	
	//Fields:
	private int numberOfDaysInAdvance;
	private double ticketPrice;
	
	//Constructors:
	public AdvanceTicket(int ticketNumber, int numberOfDaysInAdvance) {
		super(ticketNumber);
		this.numberOfDaysInAdvance = numberOfDaysInAdvance;
	}

	//Methods:
	public double getPrice() {
		if (this.numberOfDaysInAdvance >= 10) {
			ticketPrice = 30.0;
		}
		else {
			ticketPrice = 40.0;
			}
		return ticketPrice;
	}

	public int getDays() {
		return this.numberOfDaysInAdvance;
	}

	public String toString() {
		return "Number: " + getNumber() + ", Price: $" + getPrice()
		+ " Advance Ticket Discount Applied. Ticket was purchased " + getDays()
		+ " day/s before the event.";
	}

}