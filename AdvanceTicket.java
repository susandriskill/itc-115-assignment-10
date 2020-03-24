//------------------------------------------------------------------------------
//An AdvanceTicket represents a ticket with a ticket number, a price of $30.00
//if it was purchased 10 or more days in advance, and a price of $40.00 if it
//was purchased fewer than 10 days before the event.

public class AdvanceTicket extends Ticket {
	
	//Fields:
	private int numberOfDaysInAdvance;
	private double priceForTenOrMoreDaysInAdvance = 30.0;
	private double priceForTenOrFewerDaysInAdvance = 40.00;
	
	//Constructors:
	public AdvanceTicket(int number, int numberOfDaysInAdvance) {
		super(number);
		this.numberOfDaysInAdvance = numberOfDaysInAdvance;
	}

	//Methods:
	public double getPrice() {
		if (this.numberOfDaysInAdvance >= 10) {
			return priceForTenOrMoreDaysInAdvance;
		} 
		else {
			return priceForTenOrFewerDaysInAdvance;
			}
	}
	
	public int getDays() {
		return this.numberOfDaysInAdvance;
	}
//------------------------------------------------------------------------------
	public String toString() {
		return "Ticket Number: " + getNumber() + ", Ticket Price: " + getPrice()
		+ " Advance Ticket Discount Applied. Ticket was purchased " + getDays()
		+ " day/s before the event.";
	}

}
