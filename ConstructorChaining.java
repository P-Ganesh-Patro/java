package constructor;

public class ConstructorChaining {
//	student
	int id;
	String name;

	public static void main(String[] args) {
		ConstructorChaining s1 = new ConstructorChaining("Ganesh");
		System.out.println(s1.name);
		System.out.println(s1.id);
	}

	public ConstructorChaining(String name) {
		this(name.length()); // constructor chaining
		this.name = name;
	}

	public ConstructorChaining(int id) {
		this();// constructor chaining
		this.id = id;
	}

	public ConstructorChaining() {
		System.out.println("no params constructor...");
	}

}
