package pkgCore;
import java.lang.Math;


public class CarPayment {

	double totalPriceOfCar, downPayment, interestRate;
	int lengthOfLoan;
	
	public CarPayment(double totalPriceOfCar, double downPayment, double interestRate, int lengthOfLoan) {
		super();
		this.totalPriceOfCar = totalPriceOfCar;
		this.downPayment = downPayment;
		this.interestRate = interestRate;
		this.lengthOfLoan = lengthOfLoan;
	}

	public double getTotalPriceOfCar() {
		return totalPriceOfCar;
	}

	public void setTotalPriceOfCar(double totalPriceOfCar) {
		this.totalPriceOfCar = totalPriceOfCar;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLengthOfLoan() {
		return lengthOfLoan;
	}

	public void setLengthOfLoan(int lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}
	
	public double monthlyPayment() {
		double payment = (double) this.getDownPayment() * 
				(((this.getInterestRate() / 12) * Math.pow((1 + (this.getInterestRate() / 12)), this.getLengthOfLoan())) /
						(Math.pow((1 + (this.getInterestRate() / 12)), this.getLengthOfLoan()) - 1));
		return payment;
	}
	
	public double totalInterestPayed() {
		double totalInterest = (this.monthlyPayment() * this.getLengthOfLoan()) - this.getTotalPriceOfCar();
		return totalInterest;
	}

	
}
