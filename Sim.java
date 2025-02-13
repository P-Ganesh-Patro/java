package constructor;

public class Sim {
	int aadhar;
	String voterCard;
	String panCard;

	public static void main(String[] args) {
		Sim sim1 = new Sim(258741369);
		System.out.println(sim1.aadhar);

		Sim sim3 = new Sim("23GJ8849", "PSER8765");
		System.out.println(sim3.voterCard);
		System.out.println(sim3.panCard);
		System.out.println(sim3.aadhar);
	}

	Sim(int aadhar) {
		System.out.println("welcome to jio...");
		this.aadhar = aadhar;
	}

	Sim(String voterId, String panCard) {
		this.voterCard = voterId;
		this.panCard = panCard;
	}

}
