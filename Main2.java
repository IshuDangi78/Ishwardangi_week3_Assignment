package Week3;

abstract class Payment
{
	protected double amount;

	public Payment(double amount) {
		this.amount = amount;
	}
	//Abstract Method
	public abstract void processPayment();
	//Normal Method
	public void printAmount()
	{
		System.out.println("the amount to be paid in rs. : "+ amount);
	}
}
	interface Refundable
	{
		void refund();
	}
	class CreditCard extends Payment implements Refundable
	{
		public CreditCard(double amount) 
		{
			super(amount);
		}
		@Override
		public void processPayment() 
		{
			System.out.println("Processing Credit Card payment in rs. : "+amount);
			
		}
		@Override
		public void refund() 
		{
		System.out.println("Refunding rs. "+amount + " to credit card");	
		}	
	}
	class Paypal extends Payment implements Refundable
	{

		public Paypal(double amount)
		{
			super(amount);
		}

		@Override
		public void processPayment()
		{
			
			System.out.println("Processing Paypal payment of rs. : "+ amount);
		}
		@Override
		public void refund()
		{
		System.out.println("Refunding rs. "+ amount + " via Paypal.") ;
			
		}
	}
		
		class Cash extends Payment
	{

			public Cash(double amount)
		    {
				super(amount);
			}

			@Override
			public void processPayment() 
			{
				System.out.println("Processing cash payment of rs. : " +amount);
				
			}
		
		
		
		
	}

public class Main2
{

	public static void main(String[] args) 
	{
		Payment creditCardPayment = new CreditCard(15000.00);
        Payment payPalPayment = new Paypal(7500.50);
        Payment cashPayment = new Cash(3000.00);

     // Processing payments
        creditCardPayment.processPayment();
        payPalPayment.processPayment();
        cashPayment.processPayment();
        
        System.out.println();
        
        // Printing amounts
        creditCardPayment.printAmount();
        payPalPayment.printAmount();
        cashPayment.printAmount();

        System.out.println();
        
        Refundable refundableCreditCard = (Refundable) creditCardPayment;
        Refundable refundablePayPal = (Refundable) payPalPayment;

        refundableCreditCard.refund();
        refundablePayPal.refund();
        
	}

}
