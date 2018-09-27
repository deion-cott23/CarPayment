package carpay;

public class carPayment {
	
	private double cost;
	private double interestRate;
	private double downPayment;
	private int months;
	private double apr;
	//cost of car should be in dollars and cents 
	
	public double getCarPayment() {
		double pay = (cost - downPayment) + ((apr / 12) * Math.pow(apr / 12 + 1, months)) / (Math.pow(apr / 12 + 1, months) - 1);
		return pay;
	}
	
	public double getInterestRate() {
		interestRate = getCarPayment() * months - (cost - downPayment);
		return interestRate;
		
	}
	
	
	System.out.println(pay);
	System.out.println(downPayment);
	System.out.println(months);
	System.out.println(interestRate);

}
