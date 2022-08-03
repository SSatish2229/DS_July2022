import java.time.LocalDate;

public class BusBooking 
{
	public static void main(String[] args) 
	{
		
		BusTicket acc = new BusTicket(1, "satish", 500);
		
		BusTicket.Statement busTicket1 = new BusTicket.Statement();
		BusTicket.Statement busTicket2 = new BusTicket.Statement();
		BusTicket.Statement busTicket3 = new BusTicket.Statement();
		BusTicket.Statement busTicket4 = new BusTicket.Statement();
		
		acc.activateSeat1(true);
		
		double transAmt1=500;
		acc.withdraw(transAmt1);
		busTicket1.setSerialId(1);
		busTicket1.setTransactionAmount(transAmt1);
		busTicket1.setTransactionDate(LocalDate.now());
		busTicket1.setTransactionType("Debit");
		
		double transAmt2=500;
		acc.withdraw(transAmt2);
		busTicket2.setSerialId(1);
		busTicket2.setTransactionAmount(transAmt2);
		busTicket2.setTransactionDate(LocalDate.now());
		busTicket2.setTransactionType("Debit");
		
	
		System.out.println(busTicket1);
		System.out.println(busTicket2);

		
		acc.deActivateSeat(false);
		
		acc.withdraw(6000);

	}
}

class BusTicket
{
	private int seatno;
	private String name;
	private double payment;
	private BusPermission busPerm = new BusPermission(false,true,true);
	
	public double getPayment() 
	{
		return payment;
	}

	public void setPayment(double payment) 
	{
		this.payment = payment;
	}

	void activateSeat1(boolean activate)
	{
		System.out.println("Activating the BusBooking ....");
		busPerm.setWithdraw(activate);
	}
	
	void deActivateSeat(boolean deActivate)
	{
		System.out.println("de-Activating the BusBooking ....");
		busPerm.setWithdraw(deActivate);
	}
	public BusTicket(int seatno, String name, double payment) 
	{
		super();
		this.seatno = seatno;
		this.name = name;
		this.payment = payment;
	}

	void withdraw(double amt) 
	{
		if(busPerm.isWithdraw()==true) 
		{
			throw new RuntimeException("BusBooking  is not yet allowed...");
		}
		else {
			
			payment = payment - amt;
			System.out.println("BusBooking is done...");
		}
	}
	
	public static class Statement 
	{
		int seatId;
		LocalDate transactionDate;
		String transactionType;
		double transactionAmount;

		public int getSerialId() 
		{
			return seatId;
		}
		public void setSerialId(int serialId) 
		{
			this.seatId = serialId;
		}
		public LocalDate getTransactionDate() 
		{
			return transactionDate;
		}
		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}
		public String getTransactionType() 
		{
			return transactionType;
		}
		public void setTransactionType(String transactionType) 
		{
			this.transactionType = transactionType;
		}
		public double getTransactionAmount() 
		{
			return transactionAmount;
		}
		public void setTransactionAmount(double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
	

		
		public String toString() 
		{
			return "Statement [seatId=" + seatId + ", transactionDate=" + transactionDate + ", transactionType="
					+ transactionType + ", transactionAmount=" + transactionAmount + "]";
		}
		
		
	}
	
	private class BusPermission //private nested class
	{
		boolean removeSeat; //false
		boolean addSeat ;// false;
		boolean transfer; //false
		
		
		public BusPermission(boolean removeSeat, boolean addSeat, boolean transfer) {
			super();
			this.removeSeat = removeSeat;
			this.addSeat = addSeat;
			this.transfer = transfer;
		}

		public boolean isWithdraw() 
		{
			
			return false;
		}

		public void setWithdraw(boolean activate) 
		{
			
			
		}

		public boolean isRemoveSeat() 
		{
			return removeSeat;
		}

		public void setRemoveSeat(boolean removeSeat) 
		{
			this.removeSeat = removeSeat;
		}
		
		public boolean isAddSeat() 
		{
			return addSeat;
		}
		public void setAddSeat(boolean addSeat) 
		{
			this.addSeat = addSeat;
		}
		public boolean isTransfer() 
		{
			return transfer;
		}
		public void setTransfer(boolean transfer) 
		{
			this.transfer = transfer;
		}


		
	}
}
