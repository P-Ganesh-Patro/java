package constructor;

public class Constrcutor1 {
	int id;
	String name;

	public static void main(String[] args) {
		System.out.println("Constructor...");
		
		Constrcutor1 c1 = new Constrcutor1(101, "Ganesh");
		System.out.println(c1.id);
		System.out.println(c1.name);

	}

	Constrcutor1(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
