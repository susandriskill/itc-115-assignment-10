
public class TicketClient {

	public static void main(String[] args) {
		WalkupTicket();
		AdvanceTicket();

	}
	
	public static void WalkupTicket() {
		for (int i = 1000; i <= 1003; i++) {
			WalkupTicket ticket = new WalkupTicket (i);
			System.out.println(ticket);
			}
	}
	
	public static void AdvanceTicket() {
		int numberOfDaysInAdvance = 1;
		for (int i = 200; i <= 220; i++) {
			AdvanceTicket ticket = new AdvanceTicket(i, numberOfDaysInAdvance);
			System.out.println(ticket);
			numberOfDaysInAdvance += 1;
		}
	}
	
}