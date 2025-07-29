package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// Check if a student passed both theory and practical exams using logical AND.
		boolean theory = true;
		boolean practical = false;
		if (theory && practical)
			System.out.println("Student passed in both");
		else 
			System.out.println("Student didn't passed in both: so he failed");
		

	}

}
