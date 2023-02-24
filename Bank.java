package Feblab23;

class Bank{
	float i = 7.5f;
	void getRateOfInterest() {
		System.out.println();}
}
class SBI extends Bank{
	float Si = 7.0f;
	void getRateOfInterest() {System.out.println("SBI Interest = " + Si+"%"); }
}
class ICICI extends Bank{
	    float Ii = 7.5f;
		void getRateOfInterest() {System.out.println("ICICI Interest = " + Ii+"%"); }
		}
		
class AXIS extends Bank{
	float Ai = 7.75f;
	void getRateOfInterest() {System.out.println("AXIS Interest = " + Ai+"%"); }
}
 class BankInterest {

public static void main(String[] args) {
		SBI S1 = new SBI();
		ICICI I1 = new ICICI();
		AXIS A1 = new AXIS();
		S1.getRateOfInterest();
		I1.getRateOfInterest();
		A1.getRateOfInterest();
		
	}
}