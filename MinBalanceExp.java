package ThrowCustomExceptions;

//custom exception
//checked - Exception Class
public class MinBalanceExp extends Exception {
	MinBalanceExp(String errorMessage) {
		super(errorMessage);
	}
}
