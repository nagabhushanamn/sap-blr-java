package com;

//----------------------------------------------------

class BalanceException extends Exception {
	private double balance = 0.00;

	public BalanceException(double balance) {
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "in-sufficient funds , ur account current balance is : " + this.balance;
	}
}

class TxrService {
	public boolean txr(double amount, String fromAcc, String toAccNum) throws BalanceException {
		// load from & to accounts
		double fromAccountBalance = 500.00; // ex
		if (amount > fromAccountBalance) {
			BalanceException be = new BalanceException(fromAccountBalance);
			throw be;
		}
		return true;
	}
}

// ----------------------------------------------------

// ----------------------------------------------------

class TicketBooking {

	TxrService txrService = new TxrService();

	public void bookTicket() throws BalanceException {
		double ticketAmount = 1000.00;
		try {
			txrService.txr(ticketAmount, "customer-account", "emirates-account");
			System.out.println("Ticket confirmed..");
		} catch (BalanceException e) {
			System.out.println("Booking failed , Bank denied your Txn : reason => " + e.getMessage());
			throw e;
		}
	}
}

// ----------------------------------------------------

public class Sample_Appln {

	public static void main(String[] args) {

		TicketBooking ticketBooking = new TicketBooking();
		try {
			ticketBooking.bookTicket();
		} catch (BalanceException e) {
			e.printStackTrace();
		}

	}

}
